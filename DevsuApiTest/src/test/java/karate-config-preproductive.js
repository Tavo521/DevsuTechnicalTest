function fn(){
    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);

    var baseUrl = karate.properties['baseUrl'] || 'https://petstore.swagger.io/v2'

    return{
        api:{
            baseUrl: baseUrl
        }
    };
}