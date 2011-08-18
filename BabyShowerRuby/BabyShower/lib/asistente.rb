require "Date.rb"
class Asistente
  
  
  def initialize (nombre, fecha_nacimiento)
    @nombre, @fecha_nacimiento = nombre, fecha_nacimiento;
  end
 
  def age
   ((Date.today - @fecha_nacimiento).to_i/365.25).to_i
   
  end
  
  def decir_edad()
    age
  end
  
  def preguntar_edad(asistente)
    asistente.decir_edad
  end
  
end
