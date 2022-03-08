CI/CD Es un proceso que se divide en 2 fases:

	-CI(Integración Continua): En la fase de integracion es cuando en nuestra computadora tenemos el archivo modificado, donde por ejemplo arreglamos un error. Esta nueva version del archivo sin el error se 
	tiene que integrar a el	archivo original que se encuentra en la nube para que no haya conflictos.

	-CD(Distribución Continua): La distribución continua se refiere a estar continuamente distribuyendo las modificaciones que se suben a la nube, para luego llevar a cabo la implementación continua. Este
	proceso se trata de implementar continuamente los archivos modificados en los repositorios locales.

Beneficios al usar CI/CD: Al usar este proceso, nos vamos a ahorrar muchos conflictos, sin la obligacion de tener una comunicacion, casi historal, de cada movimiento

Ambientes de trabajo: Al momento de crear un programa, seguramente este necesite una serie de cambios o agregados que no habiamos tenido en cuenta desde el un principio. Con esto digo que un programa podria nunca
tener una version final y que este se actualize constantemente con el pasar del tiempo. 
En el caso de que nuestro programa ya este siendo usado por la gente sería complicado meter una actualizacion, comprobar si funciona bien y reanudar el programa sin haber causado algun problema. Por esta razon
se han creado ambientes de trabajo como los siguientes:

	-Ambiente de pruebas: En este ambiente se experimentara modificando cosas a lo loco hasta conseguir una buena idea
	-Ambiente de staging: Luego de haber incluido una nueva idea, lanzamos el programa con la nueva version para que la gente lo pruebe y avisen si encuentran algun fallo
	-Ambiente de produccion: Este es el ambiente en el que incorporamos nuestra nueva version al programa oficial