package demo

import grails.converters.JSON
import grails.test.spock.IntegrationSpec

class MarshallerIntegrationSpec extends IntegrationSpec {

    void "test marshalling subclass"() {
        when:
        def sub = new SomeGroovyClass()

        then: 'secondProperty should be represented, firstProperty should not'
        new JSON(sub).toString() == '{"propertyTwo":null}'
    }
}
