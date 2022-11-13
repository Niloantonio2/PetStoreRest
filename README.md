# Utest

Se realiza la automatización de la API [Swagger Petstore](https://petstore.swagger.io/) de los prcesos de CRUD, crear, leer, actualizar y eliminar cliente, gestionando dependencicias con [Maven](https://maven.apache.org/) en su version Apache Maven 3.8.6, [Java](https://www.java.com/es/) jdk en su version 1.8.0_221, [SerenityBDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html), [Cucumber](https://cucumber.io/) y patron de diseño Screenplay, las clases se llaman de acuerdo a UpperCamiCase y las variables lowerCamiCase.


## Data
Se utilizan datos estaticos enviados en formato json,  se valida desde codigo de respuesta escrito en lenguaje [Gerking](https://cucumber.io/docs/gherkin/)

## Estructura Codigo Fuente

La estructura del codigo fue realizada con Screenplay de la siguiente forma:
<table>

  <tr>
  <th>Interactions</th>
  <td>
    <h6>Contiene todas las interaciones que se ejecutaran en la automatizacion</h6> 
  </td>
</tr>
  <tr>
  <th>Qestions</th>
  <td>
    <h6>Contiene todos las qestion que se utilizaran para la construccion de la automatizacion</h6>
  </td>
</tr>
    <tr>
  <th>Runners</th>
  <td>
    <h6>Contiene el ejecutor de la prueba automatizada</h6>
  </td>
</tr>
  <tr>
  <th>Steps Definitions</th>
  <td>
    <h6>Contiene todos los pasos de la ejecucion de la prueba automatizada</h6>
  </td>
</tr>
  <tr>
  <th>Features</th>
  <td>
    <h6>Contiene todos los esenarios codificados en lenguaje Gherking</h6>
  </td>
</tr>
</table>



### Interactions

#### 



```java

```



### Questions

#### Validar


```java

```

### Runners

#### 

```java

```

### StepsDefinitions


#### tepDefinitions


```java

```



### Features

#### RegistroUsuario.feature


```cucumber


```



## Ejecucion

Al momento de ejecutar el proyecto y obtener el reporte debemos ubicarnos en la carpeta del proyecto y abrir el `CMD` para ejecutar el siguiente comando

```yml
    gradle clean test aggregate
```

Este comando ejecutara todos los escenarios implementados en el proyecto

```cmd
    BUILD SUCCESSFUL in 2m 2s
    7 actionable tasks: 7 executed
```

Al finalizar debemos ingresar y abrir el archivo `index.html` que se encuentra en la siguiente ruta

```yml
  <ProyectoName>\target\site\serenity\index.html
```
