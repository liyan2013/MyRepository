package wly.designmode.adapter;

/**
 * Created by wangliya on 14-1-25.
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void Attack();
    public abstract void Defense();
}
