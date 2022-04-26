# spring-cloud-microservice-training-project
# Mikroservis mimarisini kullanmanın avantajları, dezavantajları nelerdir?
Bir mikroservis ten beklediğimiz belli yetenekler vardır, bunlar;
- Ölçeklenebilirlik
- Esneklik
- CI/CD süreci
- Teknoloji çeşitliliği

- Ölceklenebilirlik (scalability)
    - Öncelikle ölceklenebilirlik (High Availibility) 2 ye ayrılabilir
        - Yatay ölceklenebilirlik ayni servisin kopyasını yaratmaktır. (Yatay zordur)
        - Dikey(donanim) ölceklenebilirlik dikey sonsuz degildir maksimum ram, disk, cpu gibi kaynak limitleri vardır ve pahalıdır.
    - Belli bir servisin Yuku arttiginda ölceklensin. Bu yeteneği saglayabilen çok fazla bilesen vardir, kubernetes, rancher, veya custom yapılabilir, veya cloud providerlar otomatik olarak veriyor.
    - Servisler kucuk parcalar oldugundan dolayı tak çıkar seklinde değiştirmesi kolay
- Esneklik 
    - Kodsal bir hatanın tum uygulamayı etkilemesinden veya tum uygulamayı bloklamasindansa tek başına gerekirse calismaz duruma gelmesi göz yumulabilir
- CI/CD deployment
    - Daha kucuk parcalar halinde deploy edebilme
    - Çok sayıda deployment pipeline oluşturabilme örnegin farklı ülkelerde 
    - Tek servisi geri alabilme (yanlış bir deploy olursa)
    - Veya bir servisin is Yuku belli saatlerde az veya yok ise o zaman araliginda deploy edilebilir
    - Veya Facebook gibi bir uygulama düşünelim sadece share özelliği 10 saniye calismasa , kullanıcı belki ben yapamadım sanacak ama sadece onun icin tum uygulamayı deploy etsek daha zorlu bir süreç gerekecek
- Teknoloji/ Insan gücü çeşitliliği
    - Farklı dillerde geliştirme
    - Farkli ekipler hatta farklı ülkelerle calışan ekipler veya kisiler
    - Bilgi birikimini yönetebilme (tüm projeyi bilmeden geliştirme yapılabilmesi)
    - Günümüzde çok farklı problemlere çok farklı teknoloji, framework, dil, sistem ile daha efektif çözümler sunabilme
    - Tek codebase üzerinde calışma zorluğu
