Sample showing inheritance usage with Springfox and Jackon.

Produced swagger.json is available at http://localhost:8080/v2/api-docs.
Check that Truck and Car are defined with allOf attribute.

Copy the sawgger.json into src/main/resources and then run mvn package on the client.
You'll see that inheritance hierarchy is preserved in the generated classes. 