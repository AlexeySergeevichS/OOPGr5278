package Controller;

import java.util.*;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;

import Model.Domain.Student;

public class ControllerClass {
    // private iGetModel model;
    private List<iGetModel> model;
    private iGetView view;
    private iGetView viewEng;
    private List<Student> studBuffer = new ArrayList<>();

    // конструктор если два языка
    public ControllerClass(List<iGetModel> model, iGetView view, iGetView viewEng) {

        this.model = model;
        this.view = view;
        this.viewEng = viewEng;
    }

    // конструктор если один язык
    public ControllerClass(List<iGetModel> model, iGetView view) {

        this.model = model;
        this.view = view;
        this.viewEng = view;
    }

    private boolean testData(List<Student> stud) {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        for (iGetModel m : model) {
            studBuffer.addAll(m.getStudents());
        }

        if (testData(studBuffer)) {
            view.printAllStudent(studBuffer);
        } else {
            System.out.println("Список студентов пуст!");
        }
        // mvc
        // view.printAllStudent(model.getStudents());

    }

    public void run() {
        //проверяем, нужно ли предложить выбор языка
        if (!(view == viewEng)) {
            String lang = view.prompt("Язык(Language)(R/E): ");
            // выбор языка
            switch (lang.toUpperCase()) {
                case "E":
                    view = viewEng;
                    break;

                default:
                    break;
            }
        }
        Command com = (Command) Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Введи команду: ");
            // проверяем, что введенный текст не вызовет ошибку
            try {
                com = Command.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIter = false;
                        System.out.println("Выход из программы");
                        break;
                    case LIST:
                        // выводим список всех студентов всех моделей
                        for (iGetModel m : model) {
                            view.printAllStudent(m.getStudents());
                        }
                        break;
                    case DELETE:
                        // удаляем студента по id
                        System.out.println("+++ Удаление студента! +++");
                        // вводим номер студента
                        command = view.prompt("Введи номер удаляемого студента: ");
                        // проверяем, что String можно перевести в Integer
                        try {
                            Boolean isNotDel = true; // флаг для проверки, что студент уже удален
                            // перебор списка моделей
                            for (iGetModel m : model) {
                                // пробуем удалить студента из модели
                                if (m.delStudent(Integer.parseInt(command))) {
                                    System.out.println("Студент удален!");
                                    isNotDel = false;
                                    break; // если в текущей модели студент удален, то дальше модели не перебираем

                                }

                            }
                            // если студент с указанным id не найден
                            if (isNotDel) {
                                System.out.println("Студент не найден!");
                            }

                        } catch (Exception e) {
                            System.out.println("Неправильный номер студента: " + command);
                        }

                        break;

                }

            } catch (Exception e) {
                System.out.println("Неправильная команда!");

            }

        }
    }

}
