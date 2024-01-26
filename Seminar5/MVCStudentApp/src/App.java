import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> studList = new ArrayList<>();
        studList.add(new Student("Катя", 25));
        studList.add(new Student("Света", 22));
        studList.add(new Student("Марат", 18));
        studList.add(new Student("Гриша", 21));
        studList.add(new Student("Женя", 18));
        studList.add(new Student("Коля", 25));
        studList.add(new Student("Оля", 23));
        studList.add(new Student("Майкл", 21));
        studList.add(new Student("Игорь", 22));
        List<Student> studListHM = new ArrayList<>();
        studListHM.add(new Student("Вера", 23));
        studListHM.add(new Student("Вика", 22));
        studListHM.add(new Student("Таня", 23));
        studListHM.add(new Student("Олег", 21));
        studListHM.add(new Student("Федор", 24));
        studListHM.add(new Student("Иван", 25));
        iGetModel model = new ModelClass(studList);
        iGetView v = new ViewClass();
        iGetModel modelHM = new ModelClassHash(studListHM);
        iGetView vEng = new ViewClassEng();
        List<iGetModel> modelList = new ArrayList<>();
        modelList.add(model);
        modelList.add(modelHM);
        
        ControllerClass controller = new ControllerClass(modelList, v,vEng);
        
        // ControllerClass controllerEng = new ControllerClass(modelHM, vEng);
         // controller.update();
        // controller.run();
        //  ControllerClass controllerEng = new ControllerClass(modelHM, vEng);
         controller.run();



    }
}
