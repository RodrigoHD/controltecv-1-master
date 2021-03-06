package com.ittepic.controltec.utilidades;

import java.util.ArrayList;

public class ActualizarPracticas {
    ArrayList<Practica> mPracticas = new ArrayList<Practica>();

    public ActualizarPracticas(ArrayList<Practica> listaPracticas)
    {
        //en caso de que se desee actualizar las practicas desde otra activity
        this.mPracticas = listaPracticas;
    }
    public ActualizarPracticas(String tipo)

    {
        switch (tipo){

            //GENERACION DE PRACTICAS NEUMATICA BASICA
            case constantes.CATEGORIA_NEUMATICA_BASICA:

                //NEUMATICA BASICA PRACTICA 1
                this.mPracticas.add(new Practica("Practica 1.-Dispositivo clasificador",            "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        1,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 2
                this.mPracticas.add(new Practica("Practica 2.-Dispositivo de apertura y cierre",    "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        2,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 3
                this.mPracticas.add(new Practica("Practica 3.-Montaje de tapas",                    "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        3,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 4
                this.mPracticas.add(new Practica("Practica 4.-Dispositivo de corte",                "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        4,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 5
                this.mPracticas.add(new Practica("Practica 5.-Apertura y cierre de una trampilla",  "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        5,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 6
                this.mPracticas.add(new Practica("Practica 6.-Control de una tolva",                "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        6,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 7
                this.mPracticas.add(new Practica("Practica 7.-Almacén de alimentación por gravedad","https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        7,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 8
                this.mPracticas.add(new Practica("Practica 8.-Control de una cinta transportadora", "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        8,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 9
                this.mPracticas.add(new Practica("Practica 9.-Dispositivo desviador",               "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        9,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 10
                this.mPracticas.add(new Practica("Practica 10.-Dispositivo de estampación.",        "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        10,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA BASICA PRACTICA 11
                this.mPracticas.add(new Practica("Practica 11.-Dispositivo de sellado en caliente", "https://festo-consulting.es/wp-content/uploads/2016/09/hidraulica.jpg","Descripcion del problema\n"+"\n" ,constantes.CATEGORIA_NEUMATICA_BASICA,
                        11,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));
                break;

             //GENERACION DE PRACTICAS NEUMATICA AVANZADA
            case constantes.CATEGORIA_NEUMATICA_AVANZADA:

                //NEUMATICA AVANZADA PRACTICA 1
                this.mPracticas.add(new Practica("Practica 1.-Dispositivo de estampado", "http://img.fenixzone.net/i/dVP7WMO.jpeg", "Descripcion del problema\n"+"\n" +"Se debe estampar las letras P, A, B y R en el cuerpo de las válvulas. Las piezas se alimentan manualmente. El cilindro 1.0 (A) realiza la estampación de las piezas. El cilindro 2.0 (B) realiza la expulsión de la pieza ya estampada",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        1,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 2
                this.mPracticas.add(new Practica("Practica 2.-Dispositivo de cortar",                          "http://img.fenixzone.net/i/LMqm0pH.jpeg","Descripcion del problema\n"+"\n" +"Las tiras de chapa, deben estar colocadas con una arista aguda, en uno de los lados con el objeto de su mecanización posterior.\n" + "\n" +
                                                                                                                                                                                "La tira de chapa es colocada en el dispositivo y sujetada por el cilindro A. El cilindro B corta con una cuchilla la tira de chapa. El cilindro A afloja la tira y el cilindro C la expulsa\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones Adicionales:\n" + "\n" +
                                                                                                                                                                                "1. Al presionar un Paro de Emergencia se detiene el proceso y se elimina el suministro de aire a todo el circuito para en un accidente poder liberar al operador.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        2,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 3
                this.mPracticas.add(new Practica("Practica 3.-Marcado de piezas",                              "http://img.fenixzone.net/i/zAcIVn0.jpeg","Descripcion del problema\n"+"\n" +"En una maquina especial han de marcarse unas piezas. La alimentación de las piezas es a través de un depósito de caída siendo empujadas contra un tope y sujetadas mediante el cilindro A, marcadas mediante el cilindro B y expulsadas mediante el cilindro C. La puesta en marcha se efectuara a través de un pulsador.\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones adicionales:\n" + "\n" +
                                                                                                                                                                                "1.- El desarrollo de las fases ha de realizarse automáticamente con la posibilidad de elección entre.\n" +
                                                                                                                                                                                "- Ciclo único.\n" +
                                                                                                                                                                                "- Ciclo continuo.\n" +"\n" +
                                                                                                                                                                                "2.- Un sensor de presencia detectara la existencia de pieza en la posición de fijación para estampado y queda bloqueada de no existir.\n" +"\n" +
                                                                                                                                                                                "3.- Colocar un PARO DE EMERGENCIA y de accionarse han de retornar los émbolos de los cilindros de inmediato a la posición inicial.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        3,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 4
                this.mPracticas.add(new Practica("Practica 4.-Dispositivo de llenado de piedras de ignicion",  "http://img.fenixzone.net/i/MUjOIgn.jpeg","Descripcion del problema\n"+"\n" +"En una tolva hay piedras de ignición, que deben de ser distribuidas en dos puestos de montaje a un ritmo determinado.\n" + "\n" +
                                                                                                                                                                                "El cilindro 1.0 (A+) abre y (A-) cierra la compuerta del deposito.\n" + "\n" +
                                                                                                                                                                                "Al accionar el pulsador marcha el cilindro 1.0 (A) abre la compuerta por un tiempo de 10 segundos y posteriormente se cierra. Las piedras de ignición caen al depósito #1. Al cerrar la tolva, el cilindro 2.0 (B) lleva el depósito #2 debajo de la tolva. Nuevamente se repite el proceso de apertura por 10 segundos y cierre de la compuerta. Mientras Tanto el depósito #1 pasa a empaque conducido por la cinta transportadora y en la mesa corredera se coloca otro depósito vació. Después de ser cerrada la compuerta por el cilindro 1.0 (A) se trasporta al segundo lugar de empaque conducido por la otra cinta trasportadora y se coloca un depósito vació en la mesa corredera, para el siguiente ciclo de operación.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        4,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 5
                this.mPracticas.add(new Practica("Practica 5.-Dispositivo de rebordonear",                     "http://img.fenixzone.net/i/oVigjbA.jpeg","Descripcion del problema\n"+"\n" +"Debemos rebordonear los tubos de cobre para instalaciones sanitarias en dos etapas:\n" + "\n" +
                                                                                                                                                                                "El tubo de cobre se coloca contra el cilindro 2.0 (B). Después de la señal de puesta en marcha, se sujeta el tubo de cobre mediante el cilindro de sujeción 1.0 (A). Posteriormente el vástago del cilindro de tope 2.0 (B) entra y sale al tubo de cobre pre-rebordeándolo, luego el cilindro 3.0 (C) mueve al segundo molde para el tubo y el cilindro 2.0 (B) nuevamente entra y sale al tubo de cobre para el rebordeo final. Seguidamente se suelta el tubo, los vástagos de los cilindros 2.0 (B) y 3.0 (C) retroceden a su posición inicial, para iniciar un nuevo ciclo de operación.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        5,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 6
                this.mPracticas.add(new Practica("Practica 6.-Taladradora y escariadora",                      "http://img.fenixzone.net/i/UKLIOa9.jpeg","Descripcion del problema\n"+"\n" +"Programa 1:\n" + "\n" +
                                                                                                                                                                                "Las piezas que solo serán taladradas, serán colocadas a mano. Accionando el pulsador de marcha, se procede a taladrar la pieza (cilindro A).\n" + "\n" +
                                                                                                                                                                                "Programa 2:\n" + "\n" +
                                                                                                                                                                                "Las piezas que, además, tienen que ser escariadas, también son colocadas a mano. A continuación con un pulsador selector de programas y con el pulsador de marcha, se activa el cilindro A para taladrar. Una vez concluido este proceso, avanza el cilindro B y desplaza la pieza a la posición de escariado usando cilindro C, posterior el cilindro B vuelve a su posición normal, con lo que puede extraerse la pieza. Para activar el programa dos es necesario usar primero el conmutador se selección de programas y después el pulsador de marcha. Si no se usa el selector, se activa automáticamente el programa 1.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        6,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 7
                this.mPracticas.add(new Practica("Practica 7.-Dispostivo de inyeccionpara decorar helados",    "http://img.fenixzone.net/i/gJHxmFt.jpeg","Descripcion del problema\n"+"\n" +"Se debe decorar con chocolate la superficie de un helado.\n" + "\n" +
                                                                                                                                                                                "El cilindro 1.0 (A+) abre la válvula de la pistola de inyección. Simultáneamente se realiza la puesta de marcha del cilindro 2 (B+) y del cilindro 3 (C). El cilindro 2.0 (B) avanza lentamente la barra de helado y el cilindro 3(C+/C-) lleva la pistola de inyección lentamente en sentido transversal a la carrera longitudinal en desplazamientos alternativos. Tan pronto como el cilindro 2 (B) haya llegado a la posición final de carrera delantera, se cierra la válvula de la pistola de inyección mediante el cilindro 1 (A-). Los cilindros 2.0 (B-) y 3.0 (C-) vuelven a sus posiciones de salida.\n" + "\n" +"\n" +
                                                                                                                                                                                "Condiciones Adicionales:\n" + "\n" +
                                                                                                                                                                                "1.- Selector de programa Ciclo único o Ciclo Automático contando hasta 7 Helados.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        7,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 8
                this.mPracticas.add(new Practica("Practica 8.-Dispositivo para embutir",                       "http://img.fenixzone.net/i/7i2ykpd.jpeg","Descripcion del problema\n"+"\n" +"En un montaje debe ensamblarse una pieza en el interior de otra, y luego introducir un pasador a través de ambas de la siguiente manera: El cilindro (A) introduce lentamente la pieza, luego retrocede y da un golpe a velocidad mayor para acabar de colocarla en su asiento, posterior el cilindro (B) sujeta a las dos piezas introduciendo el pasador por completo, y retornando los vástagos de ambos cilindros para iniciar un nuevo ciclo.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        8,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 9
                this.mPracticas.add(new Practica("Practica 9.-Cadena de galvanizacion",                        "http://img.fenixzone.net/i/92wC8I7.jpeg","Descripcion del problema\n"+"\n" +"Las piezas que serán galvanizadas son transportadas en un carro desde la superficie de trabajo hacia los 3 baños de galvanización y devuelta a la superficie de trabajo. Un cilindro de doble efecto coloca la pieza en el puesto de trabajo o la sumerge en los baños. El cilindro mantiene su posición final de carrera (baño 2) o produce un movimiento ascendente y descendente de la jaula (baño 1 y 3). Los movimientos de carrera completa o de media son consultados por 3 interruptores de final de carrera. Si el carro llega a una posición determinada en el plano horizontal, se enciende una lámpara de control (baño 1, lámpara 1; baño 2, lámpara 2; baño 3, lámpara 3; superficie de trabajo, lámpara 4).\n" + "\n" +
                                                                                                                                                                                "En posición normal, la jaula esta colocada por encima de la superficie de trabajo. Accionando el conmutador de sube / baja (S2), avanza el cilindro y la jaula es depositada sobre la superficie de trabajo para que se coloque la pieza. Una vez alcanzada nuevamente la posición normal, pueda activarse el cilindro mediante el pulsador de marcha (S). Los movimientos del carro (de la superficie de trabajo hacia el baño 1, del baño hacia el baño 2, del baño 2 hacia el baño 3, y del baño 3 nuevamente hacia la posición de trabajo) son simulados con 4 tiempos iguales t1 = 2 seg. Después de sumergir la jaula en el baño 1 (y, también, en el baño 3), el cilindro efectúa 4 movimientos de semicarrera en el segundo segmento. El baño 2, el cilindro mantiene su posición final de carrera durante 5 seg. (t2).\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones:\n" + "\n" +
                                                                                                                                                                                "Al conectar la red principal, activación del mando por medio del pulsador SET (S1); simultáneamente inicio el tiempo t1.\n" + "\n" +
                                                                                                                                                                                "Durante ese tiempo, el cilindro tiene que volver a su posición normal (ya que al desconectar él, sistema avanzo hasta el final de carrera debido a las perdidas por fugas).\n" + "\n" +
                                                                                                                                                                                "Al término del tiempo t1, se enciende la lámpara H4.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        9,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 10
                this.mPracticas.add(new Practica("Practica 10.-Prensa Moldeadora.",                            "http://img.fenixzone.net/i/voye0Aw.jpeg","Descripcion del problema\n"+"\n" +"Moldeado de platos de material de plásticos partiendo de bolas de polietileno, presión de servicio de 6 bar. Accionado el pulsador de marcha (mando de seguridad con dos pulsadores) desciende la parte superior del molde con el vástago del cilindro “A”.\n" + "\n" +
                                                                                                                                                                                "Alcanzada la presión de moldeado a 4 bar, se mantiene ese estado durante aproximadamente 10 seg. para permitir el endurecimiento de la pieza moldeada. A continuación, los platos son extraídos del molde mediante un equipo de extracción y son apilados al lado de la prensa moldeadora valiéndose de los cilindros “B”, “C” y una ventosa “V”.\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones Adicionales:\n" + "\n" +
                                                                                                                                                                                "1.- Modificar versión inicial para que el cilindro “A” del molde superior avance inmediatamente después de que la unidad de extracción se haya retirado (cilindro “B”) del selector de trabajo.\n" + "\n" +
                                                                                                                                                                                "2.- La activación del extractor con ventosa se representara mediante una lámpara en el periodo que esté en funcionamiento.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        10,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 11
                this.mPracticas.add(new Practica("Practica 11.-Limpieza Mediante un Baño",                     "http://img.fenixzone.net/i/uA6R1LV.jpeg","Descripcion del problema\n"+"\n" +"En un baño deben limpiar discos para una bomba de inyección. Un cilindro neumático “A” debe mover hacia arriba y hacia abajo el cesto lleno de discos en el interior del baño.\n" + "\n" +
                                                                                                                                                                                "Con un botón con enclavamiento se puede seleccionar cualquiera de 2 programas.\n" + "\n" +
                                                                                                                                                                                "Programa 1: Los movimientos arriba y abajo se realizan manualmente por el operario, mediante el pulsador de Puesta en Marcha. El movimiento arriba y abajo funciona todo el tiempo que se mantenga accionado el pulsador.\n" + "\n" +
                                                                                                                                                                                "Programa 2: El operario de la señal de Puesta en Marcha manualmente. El cilindro neumático “A” realiza los movimientos arriba y abajo en ciclo continuo, y la desconexión del proceso de lavado se realiza automáticamente después de un tiempo ajustado “T” de 15 segundos.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        11,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 12
                this.mPracticas.add(new Practica("Practica 12.-Equipo de Manipulación",                        "http://img.fenixzone.net/i/CauUHlc.jpeg","Descripcion del problema\n"+"\n" +"Unas piezas han de ser trasportadas por el cilindro “B” que se posiciona desde la canaleta inclinada de salida de la estación 1 para hacer un recorrido hacia la canaleta de alimentación de la estación 2. Antes de la puesta en marcha, deberá detectarse primero la presencia de una pieza en la canaleta de salida. Si no existe pieza no arranca el circuito de acuerdo al selector de programa. El cilindro “A” sube y baja una ventosa para sujetar la pieza.\n" + "\n" +
                                                                                                                                                                                "Programa 1: Ciclo simple\n" + "\n" +
                                                                                                                                                                                "Programa 2: Ciclo continúo.\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones Adicionales:\n" + "\n" +
                                                                                                                                                                                "Con un Paro de Emergencia se elimina el suministro de aire deteniendo el proceso, pero si es activado durante la traslación del cilindro “B” de la estación 1 a la 2 se permitirá solamente llegar hasta la posición de la estación 2 SIN bajar el cilindro “A” y hasta entonces se elimina el suministro de aire que en consecuencia la ventosa liberara a la pieza.",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        12,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                //NEUMATICA AVANZADA PRACTICA 13
                this.mPracticas.add(new Practica("Practica 13.-Compactador de Basura.",                        "http://img.fenixzone.net/i/zO3WQEH.jpeg","Descripcion del problema\n"+"\n" +"El prototipo de una prensa neumática para compactar basura domestica (Modelo para instalación bajo mesa), trabaja a una presión máxima de 2 bar. Esta equipado con un presor previo (1.0), que puede incluso triturar cristal, así como de un presor principal (2.0), el cual ejerce una fuerza máxima de 5 bar. Si se oprime el pulsador de puesta en marcha, avanza en primer lugar el presor previo (1.0) y a continuación avanza lentamente el principal (2.0) monitoreando su presión de avance. La carrera de retroceso de ambos cilindros de doble efecto tiene lugar a continuación y se realiza simultáneamente al mismo tiempo.\n" + "\n" + "\n" +
                                                                                                                                                                                "Condiciones Adicionales:\n" + "\n" +
                                                                                                                                                                                "En caso de que el presor principal (2.0) no alcance la posición final delantera, es decir que el contenedor de basura esté lleno, la carrera de retroceso de ambos cilindros se iniciara por medio de una válvula de secuencia. Esta debe de actuar cuando la presión en la cámara del presor principal (2.0) alcance el valor de 4 bar",constantes.CATEGORIA_NEUMATICA_AVANZADA,
                        13,
                        "https://www.youtube.com/channel/UCWikO1SmypQQ03xQTUTN8Cg/playlists?sort=dd&view=1&shelf_id=0"));

                break;

        }


    }

    public ArrayList<Practica> getPracticas() {
        return this.mPracticas;
    }
    public int getSize(){return this.mPracticas.size();}
    public Practica getPracticaById(int i) {return this.getPracticas().get(i);}
}
