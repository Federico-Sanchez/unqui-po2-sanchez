/*import example.*


describe "instancias"{
	
	
	var empresa1
	var empleadoPermanente
	var empleadoTemporario
	
//punto 2
	var empleadoContratado

	fixture  {
	
	
	
	empresa1 = new Empresa (nombre = "c9", cuit = 2040770418, empleados = [], reciboDeHaberes = [])
	
	empleadoPermanente = new PlantaPermanente(cantidadHijos = 2, antiguedad = 45, nombre = "Jose", direccion = "Smith", estadoCivil = true,
												fechaDeNacimiento = new Date(day = 4 , month = 07 , year = 1999), sueldoBasico = 100)
												
	empleadoTemporario = new PlantaTemporaria(fechaFinDesignacion = new Date(), horasExtras = 10, nombre = "Juan", direccion = "smith", estadoCivil = false, 
											fechaDeNacimiento = new Date(day = 4 , month = 07 , year = 2010), sueldoBasico = 1000)
												
	empleadoContratado = new Contratado(numeroContrato = 4, medioDePago = "efectivo", nombre = "Fede", direccion = "Smith", estadoCivil = false,
										fechaDeNacimiento = new Date(), sueldoBasico = 200)
	
											
	empresa1.agregarEmpleado(empleadoPermanente)
	empresa1.agregarEmpleado(empleadoTemporario)
	
	}
	
	
	test "sueldo neto" {
		assert.equals(4055,empresa1.montototalSueldosNetos())
	}
	
	
	test " liquidacion de sueldos "{
		empresa1.liquidacionDeSueldos()
		assert.equals(2,empresa1.cantidadRecibos())
		
	}
	
	test " empledo contratado , sueldo neto"{
		
		empresa1.agregarEmpleado(empleadoContratado)
		assert.equals(4205,empresa1.montototalSueldosNetos())
	}
	
	test " liquidacion de sueldos 2"{
		empresa1.agregarEmpleado(empleadoContratado)
		empresa1.liquidacionDeSueldos()
		assert.equals(3,empresa1.cantidadRecibos())
	}	
}

*/