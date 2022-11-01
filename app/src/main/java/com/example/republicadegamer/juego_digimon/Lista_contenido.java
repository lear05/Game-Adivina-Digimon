package com.example.republicadegamer.juego_digimon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by enriq on 4/12/2015.
 */
public class Lista_contenido {

    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos estáticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.metalgreymon, "METALGREYMON", "MetalGreymon es un Digimon tipo Cyborg, cuyo nombre y diseño son derivados de Metal y Greymon.  Tiene la forma de un gran dinosaurio bípedo, de color naranja con algunas rayas azules.(ATAQUES) Brazo Tridente, Giga Explosión."));
        aniadirEntrada(new Lista_entrada("1", R.drawable.hikari, "HIKARI", "Es una de los ocho primeros y nuevos niños elegidos, aparecidos en Digimon Adventure y Digimon Adventure 02. Su emblema y Digieggs (Armor) son los de la Luz, y su compañera es Gatomon. El nombre Hikari significa en japonés luz, lo que da sentido a su emblema y a su carácter,  su apellido también fue adaptado en la versión norteamericana, cambiando el apellido Yagami por Kamiya.."));
        aniadirEntrada(new Lista_entrada("2", R.drawable.patamon, "PATAMON", "Patamon es un Digimon Tipo Mamífero. Su nombre viene de la palabra japonesa patapata una onomatopeya que designa el sonido del aleteo. Tiene la forma de un hámster, con grandes orejas similares a alas de murciélago. Estas orejas le sirven efectivamente para volar. Su pelaje es marrón con el vientre blanco, y sus cuatro patas terminan en pequeñas garras prensiles negras (ATAQUES) Disparo de Aire, Hane Binta, Tair Atar, Liberación Patapata, Golpe de Aire."));
        aniadirEntrada(new Lista_entrada("3", R.drawable.gabumon, "GABUMON", "Gabumon tiene el aspecto de un reptil bípedo amarillo, con la panza azul con signos rosados. Lo más destacable de él es la capa de piel que siempre lleva encima, de color azul claro con rayas de azul oscuro, y garras fucsia, recordando a la piel de Garurumon. También el cuerno que lleva sobre la frente, amarillo con marcas rúnicas. Es de naturaleza tímida y nunca se dejará ver sin su piel. (ATAQUES) Minifuego, Golpe Escondido, Pequeño Cuerno, Ataque de Cuerno."));
        aniadirEntrada(new Lista_entrada("4", R.drawable.gatomon, "GATOMON", "Gatomon es un Digimon tipo bestia sagrada. Su nombre japonés es sacado de Tail (cola en inglés) por su larga cola, mientras que su nombre inglés es sacado del español gato. Su diseño se basa en un gato doméstico.(ATAQUE) Garras de Gato, Ojos de Gato, Patada de Gato."));
        aniadirEntrada(new Lista_entrada("5", R.drawable.izzy, "IZZY", "Tiene 10 años y está en cuarto grado. Izzy es la cabeza del grupo. Es el que le pone la lógica a todo y da las explicaciones. Él descubrió qué es realmente el digimundo y cómo funciona. Con ayuda de su computadora. Izzy pasa la mayor parte de su tiempo tratando de descifrar cosas que pasan desprevenidas para el resto del grupo. Se dio cuenta una noche que él era adoptada y desde entonces Izzy trata de ser fuerte y gastar su tiempo en su computadora para no prestarle atención a eso.."));
        aniadirEntrada(new Lista_entrada("6", R.drawable.garurumon, "GARURUMON", "Garurumon es un Digimon tipo bestia, cuyo nombre deriva de la onomatopeya del gruñido del lobo, mientras que su diseño deriva del lobo. Su apariencia es similar a la de un lobo, teniendo la piel blanca con rayas azules, hecha de un material muy duro, y las uñas de color violeta. Tiene en su espalda y en su cabeza un diseño algo similar a unas plumas. Su cola es larga y enroscada. (ATAQUES) Aullido Explosivo, Soplo de Cuerpo, Muro de Hielo, Llanto de Lobo."));
        aniadirEntrada(new Lista_entrada("7", R.drawable.metalgarurumon, "METALGARURUMON", "MetalGarurumon es un Digimon tipo cyborg, cuyo nombre y diseño se sacan de \"Metal\" y \"Garurumon\". Parece una versión robótica y con alas de su clásica forma de lobo, similar a la de Garurumon. La diferencia de poder es enorme ya que sus ataques son extremadamente poderosos. Su tamaño es un poco mayor, moderadamente, al de Garurumon y en su armadura se lo ve más potentoso. (ATAQUES) Cocytus Breath, Garuru Tomahawk, Grace Cross Freezer."));
        aniadirEntrada(new Lista_entrada("8", R.drawable.weregarurumon, "WEREGARURUMON", "WereGarurumon es un Digimon tipo bestia Humanoide cuyo nombre y diseño provienen de \"Werewolf\" (Hombre Lobo en inglés) y Garurumon. Lleva un cinturón en su parte superior del cuerpo, junto con una hombrera, además de pantalones vaqueros con rajas. Al ser ahora bípedo, puede utilizar las manos para atacar o trepar al estilo de las artes marciales. (ATAQUES) Patada de Luna Llena, Garras de Lobo"));
        aniadirEntrada(new Lista_entrada("9", R.drawable.lillymon, "LILLYMON", "Lillymon es un Digimon tipo Hada cuyo nombre y diseño son sacados de la flor del Lirio.  Un Hada Digimon nacida de los bellos pétalos de flores. A pesar de que tiene un aspecto como una niña humana, es un Digimon Perfecto con un poder insondable en su interior. Debido a su personalidad caprichosa, se dice que va a abrir su corazón a una chica humana con un temperamento similar.(ATAQUE) Cañon de Flores, Collar de Flores, Enredadera Intensa, Espinas de Hada, Enredadera de rayo solar, Ráfaga de flores, Tentación, Patada de sol creciente."));
        aniadirEntrada(new Lista_entrada("10", R.drawable.palmon, "PALMON", "Palmon es un Digimon tipo planta cuyo nombre y diseño provienen de \"palm tree\" (palmera). Tiene una flor tropical que brota de lo alto de su cabeza. Aunque divievoluciona de un Digimon reptil, Tanemon. Palmon ha sido clasificado del tipo plantas extrañas debido a su aspecto y cualidades especiales. Durante el día, ella abre la flor y extiende sus brazos parecidos a hojas para realizar la fotosíntesis.(ATAQUES) Hiedra Venenosa, Choque Planta, Tramo Raíz ."));
        aniadirEntrada(new Lista_entrada("11", R.drawable.rosemon, "ROSEMON", "Rosemon es un Digimon tipo Hada, cuyo nombre y diseño se derivan de la rosa. Es conocida como la \"Reina de las Flores\".  Un Digimon Hada que tiene la apariencia de una rosa, que es llamada la Reina de las Flores. Tiene la forma de una hermosa mujer, y desea seguir siendo hermosa para siempre. Su personalidad es más o menos igual, y aunque es muy confiada en algunas cosas, su poder de hecho no es desfavorable si se compara con el de otros de nivel Mega.(ATAQUES) Látigo de espinas, Estoque de rosas, Tentación Prohibida, Abrazo de Hiedra, Choque Hermoso, Terciopelo Rosa, Cuna Rosada, Disparo de Espina, Espina Peligrosa."));
        aniadirEntrada(new Lista_entrada("12", R.drawable.togemon, "TOGEMON", "Tiene la apariencia de un cactus gigante. Tiene guantes de boxeo en las manos y sobre su cabeza tiene una especie de cabellera de color naranja. Con su ataque llamado \"Ataque de espinas\" puede atacar al enemigo atrás, adelante, a sus lados o arriba.(ATAQUES) Ataque de espinas, Puñetazos Veloces, Perforador de Coco."));
        aniadirEntrada(new Lista_entrada("13", R.drawable.birdramon, "BIRDRAMON", "Birdramon es un Digimon Tipo Ave Gigante, cuyo nombre y diseño son derivados de \"Bird\" (Ave en ingles). \"Dra\" (Dragón) y \"Mon\" (Abreviación de monstruo); por lo tanto, significa \"Monstruo Ave Dragón\". Se caracterizan tanto ella como sus digi-evoluciones por que usan ataques de fuego desde el aire. Su personalidad es bastante reservada, no suele hablar, a menos que sea necesario. Solo las personas de buen corazón son capaces de tocarla, pues de lo contrario son quemadas por su fuego.(ATAQUES) Meteoros Fugaces, Aleteo de Fuego."));
        aniadirEntrada(new Lista_entrada("14", R.drawable.biyomon, "BIYIMON", "Biyomon es un Digimon Bird. Parte de sus alas han crecido para parecerse a los brazos, y es capaz de operar diestramente ellos y utilizarlos para agarrar objetos, Suele vivir en el suelo, pero cuando el peligro se acerca escapa volando lejos. Sin embargo, desde su capacidad de vuelo está en el mismo nivel que Su sueño es llegar a ser algún día Birdramon, que puede volar libremente por el cielo, y parece que no quiere convertirse.(ATAQUE) Espiral Twister, Ataque Violín, Ataque Picoteando, Ataque Tsuibami.(ATAQUES) Espada Alada, Garra de Águila, Golpe Carmesí, Huracán de Fuego."));
        aniadirEntrada(new Lista_entrada("15", R.drawable.garudamon, "GARUDAMON", "Garudamon es un Digimon Tipo Ave Humanoide, cuyo nombre y diseño derivan de Garuda, una gigantesca ave mitológica de las mitologías hindú y budista, que usa poderes sobrenaturales del fuego y de la luz.."));
        aniadirEntrada(new Lista_entrada("16", R.drawable.phoenixmon, "PHOENIXMON", "Hououmon (Phoenixmon en la versión inglesa y en el doblaje de España) es un Digimon Tipo Ave Sagrada, cuyo nombre y diseño son sacados del Fenghuang (también conocido como Fénix Chino). Su apariencia es la de un ave gigante de color amarillo, con cuatro alas doradas. También tiene, como sus demás digievoluciones, dos anillos, uno en cada pata.(ATAQUES) Explosión de luz Estelar, Llamarada Carmesí, Asalto, Fuerza Vital."));
        aniadirEntrada(new Lista_entrada("17", R.drawable.agumon, "AGUMON", "Agumon es un personaje de ficción y una criatura Digimon del anime y manga Digimon. Es la mascota extraoficial de la franquicia Digimon ya que él y sus formas alternas (llamadas Digievoluciones) son destacados en la mayoría de la mercancía Digimon. Por lo tanto, Agumon es literalmente un \"monstruo mordedor\".  Habiendo crecido y obtenido la capacidad de caminar en dos patas, es un Digimon Reptil que tiene la apariencia de un dinosaurio pequeño.(ATAQUES) Flama Bebé, Garra Ardiente, Super Flama Bebé, Claw Attack, Fuego Cruzado, Triple Flama de Bebé ."));
        aniadirEntrada(new Lista_entrada("18",R.drawable.greymon, "GREYMON", "Greymon es un Digimon tipo Dinosaurio, cuyo nombre se deriva de \"Grey\" (Antiguo), mientras que su diseño esta sacado del Ceratosaurus. Un Digimon dinosaurio cuya piel craneal se ha endurecido de forma que se cubre en una caparazón como de escarabajo rinoceronte.(ATAQUE) Mega Flama, Gran Cuerno, Muro de Fuego."));
        aniadirEntrada(new Lista_entrada("19",R.drawable.hawkmon, "HAWKMON","Un Digimon ave muy amable que siempre está tranquilo, fresco y recogido. Al igual que V-mon, es un descendiente de una especie especial que florecieron en la antigüedad, por lo que es capaz de tomar prestado el poder de los \"Digimental\" para pseudo-evolucionar al nivel armor. Su Movimiento personal está picoteando violentamente con su pico como un pájaro carpintero (Pico Carpintero). Su Movimiento especial está utilizando el adorno de plumas en su cabeza como un boomerang (Pluma Cortante)."));
        aniadirEntrada(new Lista_entrada("20",R.drawable.demiveemon, "DEMIVEEMON","Un Digimon Dragón Bebé que se desarrolló de Chibomon. Inusualmente para un Digimon bebé, posee un cuerpo, manos y pies, y así es capaz de agarrar objetos con sus dos manos pequeñas, y pasar tiempo saltando con ambos pies. Como es muy voraz, le gustan especialmente los alimentos dulces. También, ya que es muy aficionado a dormir, si cierran sus ojos al instante se quedará dormido. Su movimiento especial es embestir al adversario mientras salta (Ataque Hop). "));
    }


        /** Añade una entrada a la lista
         * @param entrada Elemento que añadimos a la lista
         */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }
    }

}