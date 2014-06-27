package wly.designmode.adapter.test;

import org.junit.Test;
import wly.designmode.adapter.*;

/**
 * Created by wangliya on 14-1-25.
 */
public class TestAdapterMode {

    @Test
    public void TestPlayers()
    {

        Player forwards = new Forwards("Leon");
        forwards.Attack();
        forwards.Defense();

        Player center = new Center("Leon");
        center.Attack();
        center.Defense();

        Player guards = new Guards("Leon");
        guards.Attack();
        guards.Defense();
    }

    @Test
    public void TestTranslator01()
    {
        Translator translator = new Translator("姚明");
        translator.Attack();
        translator.Defense();
    }
}
