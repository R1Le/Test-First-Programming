import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ Phase1Test.class,
                 Phase2Test.class,
                 Phase3Test.class,
                 Phase4Test.class,
                 Phase5Test.class,
                 Phase6Test.class,
                 Phase7Test.class })

class AllTests {
    
}
