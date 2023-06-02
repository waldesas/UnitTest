package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PersonCheckTest {

    @Test

    public void personCheckChild(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Jonas", ac.personCheck(5));
    }
    @Test

    public void personCheckChild2(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Paul", ac.personCheck(18));
    }
   
    @Test

    public void personCheckChild3(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Hans", ac.personCheck(18));
    }
 
}
