package Classes;

import Interfaces.IActorBehaviour;

/**
 * Действующее лицо(Персонаж)
 */
public abstract class Actor implements IActorBehaviour{
    /**
     * Имя
     */
    protected String name;
    /**
     * Получил заказ
     */
    protected boolean isTakeOrder;
    /**
     * Сделал заказ
     */
    protected boolean isMakeOrder;
    /**
     * Вернул товар
     */
    protected boolean isReturnOrder;

    /**
     * Конструктор
     * @param name Имя
     */
    public Actor(String name) {
        this.name = name;
        this.isReturnOrder = false;
    }

    /**
     * @return Возвращает имя персонажа
     */
    public abstract String getName();

    /**
     * @param name Имя персонажа
     */
    public abstract void setName(String name);
}