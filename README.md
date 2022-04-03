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
