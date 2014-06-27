package wly.designmode.adapter;

/**
 * Created by wangliya on 14-1-25.
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void JingGong()
    {
        System.out.println("外籍中锋 "+ name + " 进攻");
    }

    public void FangShou()
    {
        System.out.println("外籍中锋 " + name + " 防守");
    }
}
