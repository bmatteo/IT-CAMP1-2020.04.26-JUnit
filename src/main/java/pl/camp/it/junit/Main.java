package pl.camp.it.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {


            /*Class cl = Class.forName("CalculatorTest");
            String[] methotdsTab = {"sumPositiveTest", "sumPositiveAndNegativeTest"};
            for(int i = 0; i < methotdsTab.length; i++) {
                Method method = cl.getMethod(methotdsTab[i]);
                method.invoke(cl.newInstance());
            }*/


            Class cal = Class.forName("pl.camp.it.junit.Calculator");
            Method sum2 = cal.getMethod("sum", Integer.class, Integer.class);
            Object result = sum2.invoke(cal.newInstance(), 5,7);
            System.out.println(result);





        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
