<?php

class Asistente {
    private $_nombre;
    private $_fechaNaciento;

    public function __construct($nombre, $fechaNacimiento) {
        $this->_nombre = $nombre;
        $this->_fechaNaciento = $fechaNacimiento;
    }

    public function decirEdad()
    {
        return $this->_calcularEdad();
    }

    public function preguntarEdad(Asistente $asistente)
    {
        return $asistente->decirEdad();
    }
 
    private function CalculaEdad( $fecha ) {
    list($Y,$m,$d) = explode("-",$fecha);
    return( date("md") < $m.$d ? date("Y")-$Y-1 : date("Y")-$Y );
}
    private function _calcularEdad(){
        date_default_timezone_set('America/Lima');
        $diaActual = date(j);
        $mesActual = date(n);
        $anhoActual = date(Y);
        $fechaNacimiento = explode("/",  $this->_fechaNaciento);
        list($dia, $mes, $anho) = $fechaNacimiento;
        if(($mes == $mesActual) && ($dia > $diaActual))
        {
            $anhoActual = $anhoActual - 1;
        }
        if ($mes > $mesActual)
        {
            $anhoActual = $anhoActual - 1;
        }
        $edad = $anhoActual - $anho;
        return $edad;

    }
}
?>
