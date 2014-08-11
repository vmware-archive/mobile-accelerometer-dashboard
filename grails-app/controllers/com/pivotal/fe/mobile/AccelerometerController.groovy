package com.pivotal.fe.mobile



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AccelerometerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Accelerometer.list(params), model:[accelerometerInstanceCount: Accelerometer.count()]
    }
	def gauge() {
		respond "gauge.gsp"
	}
    def show(Accelerometer accelerometerInstance) {
        respond accelerometerInstance
    }

    def create() {
        respond new Accelerometer(params)
    }

    @Transactional
    def save(Accelerometer accelerometerInstance) {
        if (accelerometerInstance == null) {
            notFound()
            return
        }

        if (accelerometerInstance.hasErrors()) {
            respond accelerometerInstance.errors, view:'create'
            return
        }

        accelerometerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'accelerometer.label', default: 'Accelerometer'), accelerometerInstance.id])
                redirect accelerometerInstance
            }
            '*' { respond accelerometerInstance, [status: CREATED] }
        }
    }

    def edit(Accelerometer accelerometerInstance) {
        respond accelerometerInstance
    }

    @Transactional
    def update(Accelerometer accelerometerInstance) {
        if (accelerometerInstance == null) {
            notFound()
            return
        }

        if (accelerometerInstance.hasErrors()) {
            respond accelerometerInstance.errors, view:'edit'
            return
        }

        accelerometerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Accelerometer.label', default: 'Accelerometer'), accelerometerInstance.id])
                redirect accelerometerInstance
            }
            '*'{ respond accelerometerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Accelerometer accelerometerInstance) {

        if (accelerometerInstance == null) {
            notFound()
            return
        }

        accelerometerInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Accelerometer.label', default: 'Accelerometer'), accelerometerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'accelerometer.label', default: 'Accelerometer'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
