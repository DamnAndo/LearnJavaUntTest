package nandosan.tekno.testing;


import org.junit.jupiter.api.*;

@DisplayName("Information Test")
public class InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two"),
    })
    @DisplayName("This is test1")
    void test1(TestInfo info){
        System.out.println(info.getDisplayName());
        System.out.println(info.getTestClass());
        System.out.println(info.getTestMethod());
    }


}
