package sample

import grails.test.mixin.TestFor
import org.junit.Test

/**
 * Created by yoshikazunaganuma on 2014/03/31.
 */
@TestFor(A10)
class GormTest {
    @Test
    public void test10() {
        new A10().save()
        A10.first()
    }
}
