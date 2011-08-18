class Asistente
  
  
  def initialize (nombre, fechaNacimiento)
    @nombre, @fechaNacimiento = nombre, fechaNacimiento;
  end
 
  def age
  ((Time.now - fechaNacimiento))
  end
  
  def decirEdad()
    return age
  end
  
  def preguntarEdad(asistente)
    return asistente.decirEdad
  end
  
end
