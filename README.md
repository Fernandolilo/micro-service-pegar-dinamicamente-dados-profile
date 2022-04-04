# micro-service pegando dados dinamicamente do profile de configuração

pegando dados dinamicos do profile, caso não passa paramentros o endpoint irá expor Olá mundo, 

se passar paramentros em http://localhost:8100/greeting

os paramentos são ?name=FernandoSilva

veja a baixo http://localhost:8100/greeting?name=FernandoSilva

{
"id": 7,
"content": "Olá, FernandoSilva!"
}

sem paramentros http://localhost:8100/greeting

{
"id": 8,
"content": "Olá, Mundo!"
}

no sexto commit teremos a exposição de endpoints pelo actuator; passando a configuraçção abaixo:

management:
  endpoints:
    web:
      exposure:
        include:
        - '*'
        
esta configuração ira abrir todos os endpoints dve apenas ser usada com critérios e saber o que irá  liberar do contrario sua aplicação ficará exposta....
no log de inicio da aplicação ira mostrar a mensagem "Exposing 13 endpoint(s) beneath base path '/actuator'" 

foram liberados todos estes endpoints, para quem quiser acessar!


{
"_links": {
"self": {
"href": "http://localhost:8100/actuator",
"templated": false
},
"beans": {
"href": "http://localhost:8100/actuator/beans",
"templated": false
},
"caches": {
"href": "http://localhost:8100/actuator/caches",
"templated": false
},
"caches-cache": {
"href": "http://localhost:8100/actuator/caches/{cache}",
"templated": true
},
"health": {
"href": "http://localhost:8100/actuator/health",
"templated": false
},
"health-path": {
"href": "http://localhost:8100/actuator/health/{*path}",
"templated": true
},
"info": {
"href": "http://localhost:8100/actuator/info",
"templated": false
},
"conditions": {
"href": "http://localhost:8100/actuator/conditions",
"templated": false
},
"configprops": {
"href": "http://localhost:8100/actuator/configprops",
"templated": false
},
"configprops-prefix": {
"href": "http://localhost:8100/actuator/configprops/{prefix}",
"templated": true
},
"env-toMatch": {
"href": "http://localhost:8100/actuator/env/{toMatch}",
"templated": true
},
"env": {
"href": "http://localhost:8100/actuator/env",
"templated": false
},
"loggers-name": {
"href": "http://localhost:8100/actuator/loggers/{name}",
"templated": true
},
"loggers": {
"href": "http://localhost:8100/actuator/loggers",
"templated": false
},
"heapdump": {
"href": "http://localhost:8100/actuator/heapdump",
"templated": false
},
"threaddump": {
"href": "http://localhost:8100/actuator/threaddump",
"templated": false
},
"metrics-requiredMetricName": {
"href": "http://localhost:8100/actuator/metrics/{requiredMetricName}",
"templated": true
},
"metrics": {
"href": "http://localhost:8100/actuator/metrics",
"templated": false
},
"scheduledtasks": {
"href": "http://localhost:8100/actuator/scheduledtasks",
"templated": false
},
"mappings": {
"href": "http://localhost:8100/actuator/mappings",
"templated": false
}
}
}

liberando estes acessos e alguem sabendo o que procura terá acessoa a todos os endpointes feitos na aplicação, segurança todas, enfim,

com um acesso no edpoint de beans veja, o unico endpoit que fiz esta ali para acesso!

"beans": {
"href": "http://localhost:8100/actuator/beans",
"templated": false
},

"greetingServiceApplication": {
"aliases": [],
"scope": "singleton",
"type": "br.com.sistempro.GreetingServiceApplication$$EnhancerBySpringCGLIB$$736fdd0a",
"resource": null,
"dependencies": []
},
