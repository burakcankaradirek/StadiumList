package com.example.quiz5

class StadiumRepository {
    fun getStadiums(): ArrayList<StadiumModel> {
        val items = ArrayList<StadiumModel>()
        items.add(StadiumModel("Atatürk Olimpiyat","İstanbul", "74.753 koltuklu", R.drawable.olimpiyat))
        items.add(StadiumModel("Ali Sami Yen","İstanbul", "52.223 koltuklu", R.drawable.asy))
        items.add(StadiumModel("İzmir Atatürk","İzmir", "51.337 koltuklu", R.drawable.izmir))
        items.add(StadiumModel("Şükrü Saracoğlu","İstanbul", "47.834 koltuklu", R.drawable.fener))
        items.add(StadiumModel("Timsah Arena","Bursa", "43.361 koltuklu", R.drawable.bursa))
        items.add(StadiumModel("Beşiktaş","İstanbul", "42.590 koltuklu", R.drawable.besiktas))
        items.add(StadiumModel("Konya","Konya", "42.000 koltuklu", R.drawable.konya))
        items.add(StadiumModel("Akyazı","Trabzon", "40.782 koltuklu", R.drawable.trabzon))
        items.add(StadiumModel("19 Mayıs","Samsun", "33.919 koltuklu", R.drawable.samsun))
        items.add(StadiumModel("Yeni Adana","Adana", "33.000 koltuklu", R.drawable.adana))
        items.add(StadiumModel("Kocaeli","Kocaeli", "33.000 koltuklu", R.drawable.kocaeli))
        items.add(StadiumModel("Kadir Has","Kayseri", "32.864 koltuklu", R.drawable.kayseri))
        items.add(StadiumModel("Eskişehir Atatürk","Eskişehir", "32.507 koltuklu", R.drawable.eskisehir))
        items.add(StadiumModel("Sakarya Atatürk","Sakarya", "28.113 koltuklu", R.drawable.sakarya))
        return items
    }
}