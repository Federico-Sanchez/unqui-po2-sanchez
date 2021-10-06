
// Codigo realizado en wollok

/*


class Empresa {
	
	var nombre
	var cuit
	var empleados
	var reciboDeHaberes
	
	
	method liquidacionDeSueldos(){
		
		return self.getEmpleados().forEach({empleado => self.crearRecibo(empleado)})
		
	}
	
	
	
	method montototalSueldosNetos (){
		
		return self.getEmpleados().sum({empleado => empleado.sueldoNeto()})
	}
	
	
	method montoTotalSueldosBrutos (){
		
		return self.getEmpleados().sum({empleado => empleado.sueldoNeto()})
	}
	
	
	method montoTotalRetenciones (){
		
		return self.getEmpleados().sum({empleado => empleado.retenciones()})
	}
	
	
	
	method cantidadRecibos(){
		return self.getRecibos().size()
	}
	
	
	method agregarEmpleado (empleado){
		
		empleados.add(empleado)
	}
	
	
	method crearRecibo(empleado){
		const reciboActual = new ReciboDeHaberes(nombreEmpleado = empleado.getNombre(), direccion = empleado.getDireccion(), fechaDeEmision = new Date(), sueldoBruto = empleado.sueldoBruto(),
								sueldoNeto = empleado.sueldoNeto(), conceptos = "sueldo Bruto"+ empleado.sueldoBruto().toString() + " " + "retenciones" + empleado.retenciones().toString())
		self.getRecibos().add(reciboActual)
	}
	
	
	
	method getEmpleados(){
		
		return empleados
	}
	
	method getRecibos(){
		
		return reciboDeHaberes
	}

}



class ReciboDeHaberes {
	
	var nombreEmpleado
	var direccion
	var fechaDeEmision
	var sueldoBruto
	var sueldoNeto
	var conceptos
	
}
	
	
	
	

class Empleado {
	
	var nombre
	var direccion
	var estadoCivil
	var fechaDeNacimiento
	var sueldoBasico
	
	
	
	method calcularEdad(){
		const hoy = new Date()
		return hoy.year() - self.getAnioNacimiento() 
	}
	
	method sueldoNeto(){
		
		return self.sueldoBruto() - self.retenciones()
	}
	
	
	method sueldoBruto();
	
	method retenciones();
	
	method obraSocial();
	
	method aportesJubilatorios();
	
	
	method getFechaNacimiento(){
		return fechaDeNacimiento
	}
	
	method getAnioNacimiento(){
		return self.getFechaNacimiento().year()
	}
	
	method getNombre(){
		
		return nombre
	}
	
	
	method getSueldoBasico(){
		
		return sueldoBasico
	}
	
	
	method getDireccion(){
		
		return direccion
	}
	
	
	method getEstadoCivil(){
		
		return estadoCivil
	}
	
}




class PlantaPermanente inherits Empleado {
	
	var cantidadHijos
	var antiguedad
	
	
	
	
	override method  sueldoBruto(){
		
		return self.getSueldoBasico() + self.salarioFamiliar()
	}
	
	
	override method  retenciones (){
		
		return self.obraSocial()  + self.aportesJubilatorios()
	}
	
	
	method salarioFamiliar(){
		return self.asignacionPorHijos() + self.asignacionPorConguye() + self.asignacionPorAntiguedad()
	}
	
	
	method asignacionPorHijos(){
		
		return self.getCantHijos() * 150
	}
	
	
	method asignacionPorConguye(){
		
		return if (self.getEstadoCivil()){
		 100
		}else{
		  0
		}
	}
	
	
	method asignacionPorAntiguedad(){
		
		return self.getAntiguedad() * 50
	}
	
	
	override method obraSocial(){
		
		return self.sueldoBruto() % 10 +  self.getCantHijos() * 20
	}
	
	
	
	override method aportesJubilatorios(){
		
		return self.sueldoBruto() % 15
	}
	
	
	method getCantHijos(){
		
		return cantidadHijos
	}
	
	
	method getAntiguedad(){
		
		return antiguedad
	}

}











class PlantaTemporaria inherits Empleado {
	
	var fechaFinDesignacion
	var horasExtras
	
	
	override method sueldoBruto(){
		
		return self.getSueldoBasico() + self.getHorasExtras() * 40 
	}
	
	
	override method retenciones(){
		
		return self.obraSocial() + self.aportesJubilatorios()
	}
	
	
	
	
	override method aportesJubilatorios(){
		return self.sueldoBruto() % 10 + self.getHorasExtras() * 5 
	}
	
	
	
	override method obraSocial(){
		return if (self.calcularEdad() > 50){
			self.sueldoBruto() % 10 + 25
		}else {
			self.sueldoBruto() % 10
		}
	}
	
	
	
	method getHorasExtras(){
		return horasExtras 
	}
	

}


// punto 2 -b
class Contratado inherits Empleado {
	
	var numeroContrato
	var medioDePago
	
	
	override method sueldoBruto(){
		return self.getSueldoBasico()
	}
	
	
	override method sueldoNeto(){
		return self.sueldoBruto() - self.retenciones()
	}
	
	
	override method retenciones(){
		return 50
	}
	
	 override method obraSocial(){}
	 
	 override method aportesJubilatorios(){}
}



//c No necesito modificar la clase empresa, porque no fue necesario ya que las clases empleados son independientes de la clase Empresa y seria una mala practica que por agregar
// una clase extra tenga que modificar otra clase 







*/