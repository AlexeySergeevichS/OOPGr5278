package Classes;


import Interfaces.IReturnOrder;

/**
 * Обычный клиент
 */
public class OrdinaryClient extends Actor implements IReturnOrder {
    private int number;

    /**
     * Конструктор
     *
     * @param name   Имя клиента
     * @param number Идентификационный номер клиента
     */
    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }

    /**
     * @return Выводит идентификационный номер
     */
    public int getNumber() {
        return number;
    }

    /**
     * Установка идентификационного номера
     *
     * @param number Идентификационный номер клиента
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return Выводит имя обычного клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Изменение имени клиента
     *
     * @param name Имя клиента
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * @return Возвращает состояние (Получил или не получил клиент закза)
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * @return Возвращает состояние (Сделал или не сделал клиент закз)
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Изменение состояния получения заказа
     *
     * @param val Состояние получения заказа
     */
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Изменение состояния оформления заказа
     *
     * @param val Состояние оформления заказа
     */
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    @Override
    public boolean isPromo() {
        return false;
    }

    /**
     * @return Возвращает ссылку на самого себя
     */
    public Actor getActor() {
        return this;
    }

    @Override
    public void returnOrder() {
        setMakeOrder(false);
        setTakeOrder(false);
    }

    @Override
    public boolean isReturnOrder() {
        return this.isReturnOrder;
    }

    @Override
    public void setReturnOrder() {
        this.isReturnOrder = true;

    }


}
