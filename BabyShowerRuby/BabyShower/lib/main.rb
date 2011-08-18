require "asistente.rb"
require "Date.rb"
sonia = Asistente.new("Sonia", Date.parse("12/12/1963"))
carla = Asistente.new("Carla", Date.parse("12/10/1990"))
ximena = Asistente.new("Ximena", Date.parse("01/01/1980"))
puts sonia.preguntar_edad(carla)
puts carla.preguntar_edad(sonia)
puts carla.preguntar_edad(ximena)