package com.example.botanicalbliss

import com.example.domain.entities.Articles
import com.example.domain.entities.Flowers
import com.example.domain.entities.Photo

object Constants{

    fun getTopArticles() : MutableList<Articles>{
        var topArticlesList = mutableListOf<Articles>()

        val top1 = Articles(0, "How to choose the right home plant?",
            "\"Choosing a flower is more about a smart approach than a spontaneous purchase, because after all, a plant is a living organism, and it has its own requirements for what the conditions of maintenance should be,\" he says in an interview with Lenta.<url>\" flower grower, florist and owner of the Makkia flower workshop in Moscow Ksenia Dracheva.\n" +
                    "And in order to approach the purchase wisely, you need to start with an analysis, the expert says. It is important to think about where you plan to place the flower. As a rule, the most common option is an apartment. In this case, it is important to analyze how things are with lighting, humidity and temperature in it." +
                    "If a person already knows the specific place where the flower will stand, then you need to think about whether there are heating devices next to it, whether you need to purchase a humidifier. \"Only after analyzing these factors, you can go to the store and see on the spot which plants fit the desired parameters. You can also ask for help from a consultant, but I do not recommend always relying on him, since there is no guarantee that this person will have accurate knowledge about a particular flower,\" the expert explains.\n" +
                    "\n" +
                    "Many people, having bought a plant, bring it home in a clay pot, just put it in the chosen place and periodically (for example, once a week) water it. But this is not enough, Ksenia Dracheva is sure." +
                    "To avoid this, she recommends that along with the purchase of a flower, you also purchase a preventive agent that will at least prevent the appearance of pests or destroy those that have already appeared.\n" +
                    "\n" +
                    "\"If you are a beginner, it is almost impossible to see these pests with the naked eye, so it is better to act proactively,\" the grower emphasizes. — I can recommend Green soap, Epin, Phytosporin from such preventive means. Instructions are always attached to them — you can safely follow it.\"" +
                    "After this stage, it is important to put the flower in the place chosen for it and not disturb it for a week or a week and a half. This is the time needed for adaptation, the expert explains.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164528786/detail_1dfb055205cc1156c447cb981853eff4.jpg")
        topArticlesList.add(top1)

        val top2 = Articles(1, "How often to water your home plants?",
            "According to Ksenia Dracheva, the volume and frequency of watering is always calculated individually experimentally. \"As a rule, when buying, the instructions or description for each flower indicate how often and in what quantities to carry out watering. You can also ask a consultant about this or on the Internet. But all these recommendations need to be correlated with the real conditions that are available in the apartment,\" she explains. So, with high humidity in the room, the volume of watering, of course, should be less than recommended in the instructions.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525163752114/owl_wide_1200_014aa75fbb155f98b357d2f4877908d7.jpg")
        topArticlesList.add(top2)

        val top3 = Articles(2, "What kind of lighting and temperature should be in a room with plants?",
            "All plants like a lot of light, Ksenia Dracheva is sure, so a well-lit room is best for them. \"You may object that there are those flowers that you can safely put in the dark corners of the apartment. But they are simply more tolerant of the lack of light, and do not like it less than others,\" the specialist explains.\n" +
                    "\n" +
                    "However, she warns: do not confuse sufficient light with open sunlight. In winter, the daylight hours are significantly reduced, and therefore a special lamp can be used to maintain favorable conditions." +
                    "At what temperature does the intensity of photosynthesis increase?\n" +
                    "\n" +
                    "for plants of temperate latitudes — 15-20 degrees Celsius;\n" +
                    "for subtropical and tropical plants — 25-30 degrees Celsius.\n" +
                    "Meanwhile, the room temperature in winter is usually 15-21 degrees, and in summer — 22-28 degrees. That is, in general, the air temperature in the apartments quite fits into the framework necessary for photosynthesis throughout the year, the florist draws attention.\n" +
                    "\n" +
                    "Really sharp temperature changes can harm the flowers — because of this, problems with the roots may begin, leaves and stems will also suffer. Perhaps only cacti will react relatively calmly to such changes. But it is unlikely that something like this can happen in an apartment." +
                    "",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164955275/owl_wide_1200_92433847b66a53d3990b986dbc90a7f2.jpg")
        topArticlesList.add(top3)

        return topArticlesList
    }

    fun getPhoto() : MutableList<Photo>{
        var topArticlesList = mutableListOf<Photo>()

        val top1 = Photo(0, "#Homely", "https://pixelbox.ru/wp-content/uploads/2021/09/minimal-background-instagram-72-scaled.jpg")
        topArticlesList.add(top1)

        val top2 = Photo(1, "#Mini", "https://gagaru.club/uploads/posts/2023-06/1685726336_gagaru-club-p-rasteniya-minimalizm-vkontakte-62.jpg")
        topArticlesList.add(top2)

        val top3 = Photo(2, "#Cute", "https://vsegda-pomnim.com/uploads/posts/2022-04/1649726541_19-vsegda-pomnim-com-p-tsveti-v-vaze-minimalizm-foto-21.jpg")
        topArticlesList.add(top3)

        val top4 = Photo(3, "#Mini", "https://images.wallpaperscraft.ru/image/single/kaktus_rastenie_minimalizm_170029_2560x1440.jpg")
        topArticlesList.add(top4)

        val top5 = Photo(4, "#Homely", "https://minlife.ru/wp-content/uploads/2020/10/pexels-juan-pablo-serrano-arenas-1084188-scaled.jpg")
        topArticlesList.add(top5)

        val top6 = Photo(5, "#Cute", "http://vsegda-pomnim.com/uploads/posts/2022-04/1649650571_29-vsegda-pomnim-com-p-tsveti-minimalizm-foto-31.jpg")
        topArticlesList.add(top6)

        val top7 = Photo(6, "#Mini", "https://images.techinsider.ru/upload/img_cache/9fa/9fa9b6d3d2ed3afb9785d0bd73da7f80_ce_1920x1280x0x0_cropped_1332x888.jpg")
        topArticlesList.add(top7)

        val top8 = Photo(7, "#Mini", "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666107875_4-mykaleidoscope-ru-p-komnatnie-rasteniya-instagram-4.jpg")
        topArticlesList.add(top8)

        val top9 = Photo(8, "#Cute", "https://sun9-53.userapi.com/impg/yu_PdWpz9aEgOndz8UfvQ72lbmp5NFMsIUG4xw/3fKs2Jzojcg.jpg?size=1280x833&quality=96&sign=5cb2fe1b45f256634b84d9d9de22953d&c_uniq_tag=c14tg6-2xHsGQzQK255BcIu-E_GRvfjT3OgeAbsMcvw&type=album")
        topArticlesList.add(top9)

        val top10 = Photo(9, "#Homely", "https://get.pxhere.com/photo/book-cactus-plant-flower-pot-stack-minimal-flowerpot-flowering-plant-grass-family-land-plant-1400386.jpg")
        topArticlesList.add(top10)

        val top11 = Photo(10, "#Cute", "https://mykaleidoscope.ru/uploads/posts/2022-06/1656104031_22-mykaleidoscope-ru-p-buket-minimalizm-krasivo-foto-24.jpg")
        topArticlesList.add(top11)

        return topArticlesList
    }

    fun getFlowers() : MutableList<Flowers>{
        var topArticlesList = mutableListOf<Flowers>()

        val top1 = Flowers(0,
            "Cereus",
            "These popular cacti are pulled out by a beautiful spectacular candle. At home, Peruvian varieties are usually grown, which reach about 50 cm in height, but sometimes more.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-1.jpg")
        topArticlesList.add(top1)

        val top2 = Flowers(1,
            "Notocactus",
            "A beautiful spherical or cylindrical cactus with different thicknesses and shapes of stems depending on the variety. Notocactus grows very slowly, so it is suitable for those who do not want to constantly engage in transplants.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-2.jpg")
        topArticlesList.add(top2)

        val top3 = Flowers(2,
            "Gymnocalycium",
            "A neat spherical cactus, densely covered with large thorns. In the apartment, it grows up to 30 cm and eventually begins to bloom actively. This is a good unpretentious option for beginners!",
            4,
            "https://lafoy.ru/photo_l/foto-2395-3.jpg")
        topArticlesList.add(top3)

        val top4 = Flowers(3,
            "Chametzereus",
            "Bushy cactus with thin and densely covered with thorns shoots quickly grows in length and breadth. It blooms profusely with large red flowers, and some varieties are good for ampel cultivation.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-4.jpg")
        topArticlesList.add(top4)

        val top5 = Flowers(4,
            "Rebution",
            "Even adult specimens of rebucia are very tiny – up to 10 cm in diameter, or even up to 5 cm. But their buds are very large and bright, and you can even achieve repeated flowering.",
            4,
            "https://lafoy.ru/photo_l/foto-2395-5.jpg")
        topArticlesList.add(top5)

        val top6 = Flowers(5,
            "Trichocereus",
            "This type of cereus is distinguished by very fragrant snow-white funnel-shaped flowers. The diameter of the blossomed buds sometimes reaches up to 20 cm . Shoots are green or yellowish.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-6.jpg")
        topArticlesList.add(top6)

        val top7 = Flowers(6,
            "Espostoa",
            "This is a fluffy cactus, which is almost completely covered with fine silky hairs. Some varieties are generally wrapped in a solid cocoon in them.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-7.jpg")
        topArticlesList.add(top7)

        val top8 = Flowers(7,
            "Eriozice",
            "A capricious but spectacular cactus with a green or grayish shade of stems. They are very ribbed and prickly. With age, the cactus blooms with cream, pink or red flowers.",
            3,
            "A capricious but spectacular cactus with a green or grayish shade of stems. They are very ribbed and prickly. With age, the cactus blooms with cream, pink or red flowers.")
        topArticlesList.add(top8)

        val top9 = Flowers(8,
            "Wilcoxia",
            "A very popular flowering species of cacti, which is abundantly covered with buds throughout the spring. Thin long shoots-twigs, on which large flowers bloom, also look interesting.",
            5,
            "https://lafoy.ru/photo_l/foto-2395-9.jpg")
        topArticlesList.add(top9)

        val top11 = Flowers(9,
            "Aloe",
            "Aloe is the king of succulents, which is widely used not only in floral compositions, but also in medicine, pharmacy and cosmetology. He is originally from South Africa. Only some varieties are grown at home.",
            5,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3889.jpg")
        topArticlesList.add(top11)

        val top12 = Flowers(10,
            "Krassula",
            "Krassula, she's a fat woman, she's a \"money tree\" is distinguished by voluminous rounded leaves. Due to the yellowish tint on the dark, saturated surface, its leaves resemble coins. Therefore, a fat woman is considered an amulet that attracts wealth to the house.",
            4,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3891.jpg")
        topArticlesList.add(top12)

        val top13 = Flowers(11,
            "Aeonium",
            "Aeonium is a whole genus of centenarians. Its very name is translated from ancient Greek as \"eternal\", and not by chance. Subspecies differ not only in the color and shape of the leaves. They can grow with rosettes, bushes and even grass.",
            5,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3893.jpg")
        topArticlesList.add(top13)

        val top14 = Flowers(12,
            "Gasteria",
            "Due to the unusual shape of the gasteria, it is also known as the \"lawyer's tongue\". Squat rosettes consist of dense leaves that really look like a tongue. There are about eighty types of gasteria in total.",
            5,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3897.jpg")
        topArticlesList.add(top14)

        val top15 = Flowers(13,
            "Lithops",
            "Lithops is one of the most unusual succulents. It is also called a living stone, because at first glance it is difficult to distinguish a flower from a pebble.\n" +
                    "\n" +
                    "It reveals its essence only during the flowering period, when bright yellow, white, pink and orange flowers appear between thick leaves resembling a cylinder divided in half.",
            5,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3901.jpg")
        topArticlesList.add(top15)

        val top16 = Flowers(14,
            "Duval",
            "There are about twenty species of duvalia, and they all grow in southern Africa. These are small succulents with oval or rounded stems. They are notable for their burgundy, brown, purple or even black colors that resemble a starfish.",
            5,
            "https://lafoy.ru/photo_l/sukkulenty-foto-60-3903.jpg")
        topArticlesList.add(top16)

        return topArticlesList
    }

    fun getArticles() : MutableList<Articles>{
        var topArticlesList = mutableListOf<Articles>()

        val top1 = Articles(0, "How to choose the right home plant?",
            "\"Choosing a flower is more about a smart approach than a spontaneous purchase, because after all, a plant is a living organism, and it has its own requirements for what the conditions of maintenance should be,\" he says in an interview with Lenta.<url>\" flower grower, florist and owner of the Makkia flower workshop in Moscow Ksenia Dracheva.\n" +
                    "And in order to approach the purchase wisely, you need to start with an analysis, the expert says. It is important to think about where you plan to place the flower. As a rule, the most common option is an apartment. In this case, it is important to analyze how things are with lighting, humidity and temperature in it." +
                    "If a person already knows the specific place where the flower will stand, then you need to think about whether there are heating devices next to it, whether you need to purchase a humidifier. \"Only after analyzing these factors, you can go to the store and see on the spot which plants fit the desired parameters. You can also ask for help from a consultant, but I do not recommend always relying on him, since there is no guarantee that this person will have accurate knowledge about a particular flower,\" the expert explains.\n" +
                    "\n" +
                    "Many people, having bought a plant, bring it home in a clay pot, just put it in the chosen place and periodically (for example, once a week) water it. But this is not enough, Ksenia Dracheva is sure." +
                    "To avoid this, she recommends that along with the purchase of a flower, you also purchase a preventive agent that will at least prevent the appearance of pests or destroy those that have already appeared.\n" +
                    "\n" +
                    "\"If you are a beginner, it is almost impossible to see these pests with the naked eye, so it is better to act proactively,\" the grower emphasizes. — I can recommend Green soap, Epin, Phytosporin from such preventive means. Instructions are always attached to them — you can safely follow it.\"" +
                    "After this stage, it is important to put the flower in the place chosen for it and not disturb it for a week or a week and a half. This is the time needed for adaptation, the expert explains.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164528786/detail_1dfb055205cc1156c447cb981853eff4.jpg")
        topArticlesList.add(top1)

        val top2 = Articles(1, "How often to water your home plants?",
            "According to Ksenia Dracheva, the volume and frequency of watering is always calculated individually experimentally. \"As a rule, when buying, the instructions or description for each flower indicate how often and in what quantities to carry out watering. You can also ask a consultant about this or on the Internet. But all these recommendations need to be correlated with the real conditions that are available in the apartment,\" she explains. So, with high humidity in the room, the volume of watering, of course, should be less than recommended in the instructions.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525163752114/owl_wide_1200_014aa75fbb155f98b357d2f4877908d7.jpg")
        topArticlesList.add(top2)

        val top3 = Articles(2, "What kind of lighting and temperature should be in a room with plants?",
            "All plants like a lot of light, Ksenia Dracheva is sure, so a well-lit room is best for them. \"You may object that there are those flowers that you can safely put in the dark corners of the apartment. But they are simply more tolerant of the lack of light, and do not like it less than others,\" the specialist explains.\n" +
                    "\n" +
                    "However, she warns: do not confuse sufficient light with open sunlight. In winter, the daylight hours are significantly reduced, and therefore a special lamp can be used to maintain favorable conditions." +
                    "At what temperature does the intensity of photosynthesis increase?\n" +
                    "\n" +
                    "for plants of temperate latitudes — 15-20 degrees Celsius;\n" +
                    "for subtropical and tropical plants — 25-30 degrees Celsius.\n" +
                    "Meanwhile, the room temperature in winter is usually 15-21 degrees, and in summer — 22-28 degrees. That is, in general, the air temperature in the apartments quite fits into the framework necessary for photosynthesis throughout the year, the florist draws attention.\n" +
                    "\n" +
                    "Really sharp temperature changes can harm the flowers — because of this, problems with the roots may begin, leaves and stems will also suffer. Perhaps only cacti will react relatively calmly to such changes. But it is unlikely that something like this can happen in an apartment." +
                    "",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164955275/owl_wide_1200_92433847b66a53d3990b986dbc90a7f2.jpg")
        topArticlesList.add(top3)

        val top4 = Articles(3, "Do ornamental plants need fertilizers and top dressing?",
            "Fertilization of plants, according to the expert, is an important topic, because flowers are living organisms. \"Like a person, they need vitamins, adding top dressing from time to time is necessary. But it's important to do it wisely. With their overabundance or lack, one or another disease may develop. Therefore, it is always necessary to act strictly according to the instructions,\" the expert explains. Vitamins and useful substances, according to her, allow the plant to reveal itself in full glory." +
                    "Types of fertilizers for indoor plants:\n" +
                    "\n" +
                    "organic: ash, vermicompost, compost, peat, or humus and others;\n" +
                    "mineral: nitrogen, phosphoric, potassium, magnesium and so on;\n" +
                    "combined." +
                    "One of the factors that you can rely on is the price, says Ksenia Dracheva. \"As a rule, the more expensive the top dressing, the more effective and concentrated the composition of the fertilizer. The most important thing is to remember that fertilizers are applied to wet soil,\" she notes." +
                    "",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164604722/owl_wide_1200_bf31a6f68fa168082775c9ae619d41c9.jpg")
        topArticlesList.add(top4)

        val top5 = Articles(4, "How to transplant homemade flowers?",
            "According to the florist, there are two main types of soil: clean and with additives. Pure, in turn, is divided into acidic and alkaline. \"But, as a rule, only experienced flower growers resort to such a division. They can already understand which soil is suitable for a particular category of plants. Also, if necessary, they can independently choose the composition of the soil and a number of additional fillers necessary for a specific type of houseplant,\" says the florist." +
                    "The only thing is that it is necessary to purchase drainage — expanded clay or charcoal, which pours out to the bottom of the pot and insures against transfusion, does not allow the roots to rot, absorbing excess moisture, emphasizes Ksenia Dracheva.\n" +
                    "\n" +
                    "If the soil is still wrong to pick up, then the flower will let you know about it, the expert is sure: \"For example, if the plant is blooming, it will not give the maximum result in flowering. Flowers may appear, but rare and small, or they will not be at all.\"" +
                    "As for transplanting, it is better to do it at any time of the year, except in winter, with the exception of emergency situations.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525163646812/owl_wide_1200_a9e78b470a0684a11e5d843c8926fa4b.jpg")
        topArticlesList.add(top5)

        val top6 = Articles(5, "How to transplant flowers?",
            "1. Choose a pot with a drainage hole that is a couple of centimeters larger than the previous one, put drainage on its bottom.\n" +
                    "\n" +
                    "2. Remove the plant together with the earthen lump from the pot. If there are rotten areas of the roots, carefully cut them off.\n" +
                    "\n" +
                    "3. Place the flower in a new pot, but not too deep, pour the earth into it, tamping it down a little. It is possible to water the plant again only two or three days after transplantation.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525164754807/owl_wide_1200_5ee504b67e32583f45ed1839219d0fe2.jpeg")
        topArticlesList.add(top6)

        val top7 = Articles(6, "How to take care of indoor plants depending on the season?",
            "\"The opinions of flower growers on the care of indoor plants vary at different times of the year. Someone says that in winter the flower needs to be watered more, and someone thinks otherwise. But I'm sure it all depends on the individual conditions in the apartment,\" the florist emphasizes.\n" +
                    "\n" +
                    "It is important to understand, she notes, that in summer this parameter is influenced by the sun, and in winter by radiators. Rather, it is necessary to adhere to such a rule that when the earth dries up below four centimeters deep, then the plant can be watered a little. \"Following this rule, you will set your own watering regime without harming the plant,\" explains Ksenia Dracheva.\n" +
                    "\n" +
                    "The main thing, according to her, is not to copy all the recommendations that are on the Internet: there is generalized information, because of which in some cases the plant may wither. The main thing is not to forget to look at the reaction of the flower to specific manipulations in specific conditions of detention. Only the plant itself will tell you what he likes, and what should be avoided categorically, the expert advises in conclusion.",
            "https://icdn.lenta.ru/images/2023/05/25/16/20230525165610415/owl_wide_1200_ed8d456ad32ca554b968be6d6e81dc01.jpg")
        topArticlesList.add(top7)

        return topArticlesList
    }
}