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

    @Test

    public void personCheckAdult(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Sascha", ac.personCheck(30));
    }

    @Test

    public void personCheckAdult2(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Hans", ac.personCheck(100));
    }

    @Test

    public void personCheckAdult3(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Sasa", ac.personCheck(33));
    }
    
    @Test

    public void personCheckAdult4(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Uncle Peter Sascha", ac.personCheck(50));
    }
    
    @Test

    public void personCheckAdult5(){
        PersonCheck ac = new PersonCheck();
        Assert.assertEquals("Uncle Peter", ac.personCheck(33));
    }
 
}
