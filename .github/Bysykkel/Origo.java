

class Origo {


//HENT DATA FRA 4 CURL REQUESTS:

//1:  curl -H "Client-Identifier: IDENTIFIER" https://gbfs.urbansharing.com/oslobysykkel.no/gbfs.json
//Henter informasjon om auto-discovery-fil som lenker til alle de andre filene som er publisert av systemet.


//2: curl -H "Client-Identifier: IDENTIFIER" \  https://gbfs.urbansharing.com/oslobysykkel.no/system_information.json
//Henter maskinlesbar grunnleggende informasjon om Oslo Bysykkel

//3: curl -H "Client-Identifier: IDENTIFIER" \  https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json
//Henter informasjon om alle stasjoner, med adresser og beskrivelse.

//4: curl -H "Client-Identifier: IDENTIFIER" \  https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json
//Henter tilgjengelighet på alle sykler og stasjoner.




}
