- Encontre anidación de ifs, lo cual era muy complicado leer el codigo e 
  implementar nuevos Items.
- Clase GildedRose incumple el principio de Responsabilidad Única
  por eso se procedió a dividir esa responsabilidad en otras clases.
- Se aplicó el principio de Sustitución de Liskov, abstrayendo el
  comportamiento específico en una implementación que utilizan las clases, 
  en este caso la función calculateQuality().
- Se aplicó el principio de Apertura y cierre, cerrando los diferentes tipos
  de items a posibles cambios y se hizo la apertura para poder extender los
  mismos.
- Se creó tres funciones dentro la clase Item los cuales decrementa e 
  incrementan los dias a vender y la calidad.
- Se aplicó el principio de Segregación de Interfaces debido a que las clases
  no dependen de interfaces que no utilizan.
- Encontre el mal olor de que no se utilizaban nombres que se puedan buscar
  Ej. 50 valor maximo de calidad.