# java-all/java/Jaxrs
# This is example of Jersey's RESTful service with java 8 features for beginners.
Jersey, reference implementation to develope RESTful web service based on the JAX-RS specification.
By this example,  you will come to know how to develop a simple  RESTful service with Jersey.

# Build and Run this example as below:
      mvn clean install

# Below are the end points to test this example.
  # Adding the User:
    http://localhost:8080/Jaxrs/rest/users/api/save 
  # Get all Users:
    http://localhost:8080/Jaxrs/rest/users/api/getall
  # Get User by id(Using @PathParam)
    http://localhost:8080/Jaxrs/rest/users/api/{id}
  # Get User by id(Using @QueryParam)
    http://localhost:8080/Jaxrs/rest/users/api/getbyid?id={}
  
