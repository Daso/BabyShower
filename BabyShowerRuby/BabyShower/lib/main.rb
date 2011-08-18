require "asistente.rb"
sonia = Asistente.new("Sonia", 12/12/1963)
carla = Asistente.new("Carla", 12/10/1990)
puts sonia.preguntarEdad(carla)
puts carla.preguntarEdad(sonia)

