package Annotation;

@FirstAnnotation(value = "Daniel", bairros = "SQS203",numeroCasa = 3)
public class AnnotatedClass {
    
    @FirstAnnotation(value = "Pedrozo", bairros = {"City Centre", "Dublin 7"},numeroCasa = 3)
    String nome;
}
