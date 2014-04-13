import sample.ddl.A01
import sample.ddl.A02
import sample.ddl.A04
import sample.ddl.A05
import sample.ddl.A06

import sample.ddl.B01
import sample.ddl.B02
import sample.ddl.B04
import sample.ddl.B05
import sample.ddl.B06

class BootStrap {

    def init = { servletContext ->


        def a05 = new A05(b05: new B05()).save(failOnError: true, flush: true)
        a05.delete()

        def a06 = new A06(b06: new B06()).save(failOnError: true, flush: true)
        //a06.b06.delete()
        def b06 = a06.b06
        a06.b06 = null
        a06.save()
        b06.delete()
        //b01.delete(flush: true)
    }
    def destroy = {
    }
}
