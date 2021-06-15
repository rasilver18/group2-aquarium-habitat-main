package com.aquariumhabitat.demo;

import com.aquariumhabitat.demo.models.Environments;
import com.aquariumhabitat.demo.models.Fish;
import com.aquariumhabitat.demo.models.Water;
import com.aquariumhabitat.demo.repositories.EnvironmentRepository;
import com.aquariumhabitat.demo.repositories.FishRepository;
import com.aquariumhabitat.demo.repositories.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    EnvironmentRepository environmentRepo;
    @Autowired
    FishRepository fishRepo;
    @Autowired
    WaterRepository waterRepo;

    @Override
    public void run(String... args) throws Exception{
        Water saltWater = new Water("Salt Water",
                "Salt Water composes most of the planets hydrosphere and is integral to all life on the planet." +
                        " The Worlds seas are the habitat of over 230,000 know species, but so little of these seas are unexplored," +
                        " some estimate that number to be over 2,000,000. Each species is unique: from microscopic algae " +
                        "to the largest know animals in existence. At Underwater Lifestyles we are interested in helping you" +
                        " to safely bring these species safely into your home or office.", 1,
                "static/images/SaltWater.jpg");
        Water freshWater = new Water("Fresh Water",
                "Fresh water is any naturally occurring water except for seawater. All water is critical for the continual life of all organisms." +
                        " Most Fresh water is accumulated precipitation forming vast streams, rivers, and Lakes. " +
                        "The amount of Fresh Water species falls short of what is contained in the world’s oceans," +
                        " only clocking in at around 10,000. Many of them are small and may seem insignificant, but they pay a vital role" +
                        " in sustaining life on our planet. At Underwater Lifestyles we are 100% committed to safe removal of all species" +
                        " we offer as not to disturb any part if the environment.", 0,
                "static/images/FreshWater.jpg");
        waterRepo.save(saltWater);
        waterRepo.save(freshWater);




        Fish blueSpottedGrouper = new Fish("Blue-Spotted Grouper",
                "The bluespotted grouper is a species of marine ray-finned fish," +
                        " a member of the subfamily Epinephelinae: the groupers. These fish stand out with the blue spots that cover their body" +
                        "The species is extremely widely distributed, occurring in warm waters" +
                        " from the Red Sea to South Africa and east to French Polynesia and the Pitcairn group",
                saltWater,"These are a predator species, they like warm waters and lay mostly motionless",
                2, "");
        Fish longNoseButterflyFish = new Fish("Longnose Butterfly Fish",
                "The Longnose Butterfly, Forcipiger longirostris, has a brightly" +
                        " colored yellow body accented with a black face mask and a prominent eye-spot at the tail" +
                        " and an elongated snout. They are very peaceful and can be kept with other peaceful fish," +
                        " but may become aggressive towards other Butterflies with a similar pattern or coloration in smaller tanks.",
                saltWater,  "They are also not reef safe since they will nip at and eat soft corals" +
                " and stony polyps as well as ornamental shrimp, tube worms and anemones." +
                " Diet should include a variety of mysis and vitamin enriched brine shrimp, spirulina, nori, seaweed, marine algae," +
                " and algae based foods, 2-3 times daily.",
                1,"");
        Fish polleneiGrouper = new Fish("Pollenei Grouper",
                "The Polleni Grouper, Cepholopholis polleni, also known as the Harlequin Hind, Harlequin Grouper, or Harlequin Rockcod," +
                        " is a rare and beautiful species of grouper. It has a fantastically colored green, yellow," +
                        " and sometimes purple body with yellow tipped fins.",
                saltWater,  "They are aggressive eaters and should not be housed with small fish or inverts." +
                " A tank of at least 100 gallons is best to house this fish." +
                " The Polleni Grouper is one of the more rare fish found in the aquarium trade. The Polleni Grouper will eat most meaty foods.",
                3,"");
        Fish redParrotFish = new Fish("Red Parrot Fish",
                "The parrot fish is so called because it has teeth that form a parrot-like beak. Since they eat algae out of coral reefs and rock," +
                        " these teeth benefit them. They have large scales, and pectoral fins that help them swim." +
                        " The tail fin is divided into two parts, which helps them swim fast." +
                        " The parrot fish are popular because of their bright colors, but they are not a great choice to keep in an aquarium.",
                saltWater, "The Red Parrotfish can reach up to 30\" in length and requires a tank no less" +
                " than 300 gallons as a fully grown adult. As a juvenile a tank of 60-100 gallons will be OK, but only temporarily." +
                " It is also best to keep in mind that too small of an environment can stunt their growth and they can develop 'behavior issues'." +
                " Parrotfish are also known for building mucus cocoons to protect themselves while they sleep at night," +
                " so providing plenty of live rock with naturally forming algae and live Coral is essential to help the Parrotfish adapt.",
                4,"");
        Fish passerAngelFish = new Fish("Passer Angel Fish",
                "King Angelfish or Passer Angelfish is a large marine angelfish of the family Pomacanthidae. Due to its large size and bright colors" +
                        " it is a popular aquarium fish. King Angelfish or Passer Angelfish are sexually isomorphic," +
                        " meaning males and females are visually identical on the outside. They do, however undergo significant changes in coloration" +
                        " and to a lesser degree shape as they mature.",
                saltWater, "The adult Angelfish needs plenty of live rocks for hiding and grazing," +
                " that is why make sure to decorate the aquarium cleverly. It also requires extensive rockwork and deep caves to feel secure." +
                " The adult Emperor Angelfish may found nipping at stony and soft corals, clam mantles, but doesn't disturb other small polyped" +
                " stony corals. It should be fed a diet of Spirulina, marine algae, high-quality angelfish preparations, mysis or frozen shrimp," +
                " and other meaty items. The adult Emperor Angelfish thrives well in a temperature range of 72-78 degrees Fahrenheit" +
                " and pH of 8.1-8.4.",
                3, "");
        Fish rainbowWrasse = new Fish("Rainbow Wrasse",
                "The Rainbow Wrasse, Thalassoma quinquevittatum, has a multitude of common names including Five-Striped Surgeonfish," +
                        " Five-Striped Rainbowfish, Red-Ribbon Wrasse, Pinkface Wrasse, Lunate-Tailed Wrasse, Five-Striped Wrasse," +
                        " Pinkface Rainbowfish.",
                saltWater, "They should be kept in a tank of at least 60 gallons with plenty of live rock hiding places," +
                " a sandy substrate, and tightly sealed lid to prevent escapes. They will eat a varied carnivorous diet and may consume small fishes" +
                " or inverts so be cautious with tank pairings.",
                2, "");
        Fish smallRedScorpionFish = new Fish("Small Red Scorpion Fish",
                "Scorpionfish are bottom-dwelling fish that have also been called rockfish or" +
                        " stonefish because of their tendency to live among rocks near the seafloor. There are more than 200" +
                        " known species of scorpionfish in the ocean. Members of this fish family are commonly found in the" +
                        " Indian and South Pacific Oceans where water temperatures are temperate and coral reefs are plentiful." +
                        " Coral reefs provide the perfect space for a scorpionfish to hide and hunt for prey and also avoid any" +
                        " potential predators brave enough to take a bite.",
                saltWater, "It will spend much of its time hiding in caves during the daylight but as dusk and dawn will come out and show off." +
                " The Red Scorpionfish can grow up to 15 inches and should be kept in a tank no less than 120 gallons. " +
                "We advise you to keep plenty of live rock in your tanks giving it a place to retreat to, as well as open space for the " +
                "Scorpionfish to spread out and swim. Keeping multiple Scorpionfish in one tank should be approached with caution",
                5, "");
        Fish tompotBlenny = new Fish("Tompot Blenny",
                "The Tompot Blenny has a bisecting color pattern with the front half being a blue to pale brown color " +
                        "and the back half is orange/yellow. They are hardy and can be housed with other peaceful fish in a reef tank" +
                        " setting, but may become territorial towards other blennies, gobies or dartfish in smaller tanks.",
                saltWater, "This blenny will stay mainly towards the bottom of the tank, " +
                "searching for algae to graze on in between meals. Diet should include a variety of spirulina, " +
                "marine algae, and seaweed and algae based foods 2-3 times daily.",
                2, "");
        Fish electricBlueDempsey = new Fish("Electric Blue Dempsey",
                "This blenny will stay mainly towards the bottom of the tank, searching for algae to graze on in between meals." +
                        " Diet should include a variety of spirulina, marine algae, and seaweed and algae based foods 2-3 times daily.",
                saltWater,  "Dempseys will eat a variety of prepared, fresh, frozen and live foods." +
                " They’re carnivorous and will eat just about any fish that will fit in their mouth. If you’re into feeding live foods," +
                " the fish will eat small fish, worms and even brine shrimp. Pieces of frozen mysis shrimp, brine or bloodworms are also a favorite" +
                " treat.",
                3, "");
        Fish greenReefChromis = new Fish("Green Reef Chromis",
                "The Blue Green Chromis is a very active fish once acclimated and should be given frequent small feedings." +
                        " They will accept most fish foods including flakes, frozen, freeze dried and live foods. " +
                        "Give them a varied diet for best results. Even though they are really hardy and a great fish for a saltwater beginner," +
                        " they may come down with most of the common saltwater fish diseases and using a quarantine tank is a must. " +
                        "Keep them in quarantine for 2 - 3 " +
                        "weeks before introducing them into your main tank so you can monitor for any sign of a potential outbreak.",
                saltWater,  "Generally considered \"reef safe\" they should be able to handle themselves well" +
                " in saltwater reef tanks, however, you may not want to put them in with fish large enough to eat them." +
                " These fish are plankton feeders.Frequent (2 times per day) and varied feedings." +
                " Try to give them a variety of marine foods. They may accept vitamin enriched flake foods, frozen and definitely live foods.",
                1,"");

        Fish goldFish = new Fish("Goldfish",
                "The goldfish is a freshwater fish and is one of the most common aquarium fish." +
                        "The goldfish is not native to Lake Erie, but years of pet dumping has introduced this hazardous fish into the environment. " +
                        "Goldfish breeds vary in size and color which and are known to exist in combinations of white, yellow, brown, orange, red " +
                        "and black colors. Goldfish varies in scale coloring and size and therefore, they look unique as they are specifically" +
                        " bred to look unique.",
                freshWater,  "You might be surprised by how big goldfish can grow. With proper care, common goldfish can reach up to" +
                " 10 inches and fancy goldfish can reach up to 8 inches. So you’re going to need a big tank or a pond, not a small bowl. " +
                "Food is a vital part of goldfish care. Goldfish can survive on surprisingly small amounts of food," +
                " so it’s unlikely that you will under-feed them.",
                1, "");
        Fish brownTrout = new Fish("Brown Trout",
                "An active freshwater fish, the trout thrives in cold temperate regions in the wild." +
                        " Recent trends, however, see more aquarists attempting to keep these fish in a domestic setting." +
                        " Captivity is certainly not an ideal situation for this large carnivorous fish and, in fact, it is illegal " +
                        "in many states. In regions where keeping trout is not illegal, it requires a hefty financial investment " +
                        "and thorough knowledge of this Salmoninae subfamily in order to simply keep the fish alive.",
                freshWater, "When trout are kept legally in captivity, there are a number of things that" +
                " must be considered in order to keep the fish alive in humane conditions. These things include a complete understanding " +
                "of the variety of fish, the diet of the fish, the space requirement of the fish, the environmental needs of the fish, " +
                "and precautions for the health of the fish. The brown trout averages in length between 7.9 to 31.5 in inches," +
                " but they can reach as large as 3.3 feet! The average weight of this species of brown trout is around 4 1/2 pounds " +
                "but have sometimes been known to reach up to 29lbs",
                5, "");
        Fish americanEel = new Fish("American Eel",
                "The American Eel is a species of eel that lives in both fresh and salt water, making water changes easier. " +
                        "It has gills and slithers around your fish tank, most are slick and have wedge shaped heads.",
                freshWater,  "Feed as much as can fit in the head, often they will swim up to the prey and snap out at it. " +
                "Then they will drag it under the surface and swallow it. These creatures will grow up to 5ft long so make sure you are placing these in a large tank",
                3,"");
        Fish bleedingHeartTetra = new Fish("Bleeding Heart Tetra",
                "The Bleeding Heart Tetra, is a tropical freshwater fish native to the Upper Amazon River basin. " +
                        "This species are extremely rare and found in the Rose river. Bleeding Heart Tetra Fish grow to 2\" long including the tail " +
                        "and lives for around five years. Pet Bleeding Heart Tetras are active swimmers and quarrel with each other, but rarely do much harm." +
                        " It is best to house these freshwater fish in at least a 20-gallon tank, but more is better because they quarrel with each other.",
                freshWater,  "Provide dark gravel, a balance of hiding places, and subtle lighting for your pet Bleeding Heart Tetra. " +
                "These things, along with floating plants and some open swimming space, will keep your pet Bleeding Heart Tetra happy." +
                "Pet Bleeding Heart Tetras are omnivorous. In the wild they are opportunistic feeders and eat everything from aquatic insects and larvae, " +
                "to aquatic plants, fallen fruits, and other plants. The Bleeding Heart Tetra or Spotfin Tetra requires a varied diet. " +
                "It will happily eat most appropriately-sized commercial aquarium food in addition to live aquarium foods and chopped blanched lettuce leaves. " +
                "Live or freeze dried blood worms will also be greatly appreciated. Pet Bleeding Heart Tetras do best if fed multiple times a day," +
                " and then only offer what they can consume in about 3 minutes.",
                2, "");
        Fish rayFinnedFish = new Fish("Ray Finned Fish",
                "The ray-finned fishes are so called because their fins are webs of skin supported by bony or horny spines (\"rays\")," +
                        " as opposed to the fleshy, lobed fins that characterize the class Sarcopterygii (lobe-finned fish). " +
                        "Ray-finned fishes occur in many variant forms. The main features of a typical ray-finned fish are shown in the adjacent diagram." +
                        " The swim bladder is the more derived structure",
                freshWater, "Ray-finned have been living in tanks since the beginning of the 20-th century. " +
                "Keeping the fish in a tank doesn’t seem to be a difficult task: these species are not demanding and are quite enduring," +
                " they can live in rather dirty water. However, this is a predator and only large fishes can be their tankmates. Another thing is, " +
                "that the fish is a slow one and it takes a while for it to find the food, which can be a problem when dwelling together with fast " +
                "fishes in the tank – Ray-finned may starve.",
                2, "");
        Fish gouramiFish = new Fish("Gourami Fish",
                "Gouramis are relatively undemanding, and therefore are well suited for most community aquariums. " +
                        "Choose non-aggressive tankmates of similar size. Dwarf Cichlids are suitable, as are characins and other labyrinth fish. " +
                        "Because the males may be territorial, keep only one male Gourami in a tank. " +
                        "If space is large enough to allow each to claim its own territory, two may be tried.",
                freshWater,  "Gouramis will eat almost any food; however, it's important to vary the diet to ensure balanced nutrition." +
                " A combination of dry flake food as well as frozen and fresh/live foods will provide a well-rounded diet. When conditioning fish prior to breeding, " +
                "offer fresh vegetables such as lettuce, cooked peas, and spinach, as well as live foods such as blackworms, brine shrimp, and glass worms. " +
                "All breeding specimens must be well-fed and healthy before moving them to a breeding tank.",
                1,"");
        Fish nileTalapia = new Fish("Nile Talapia",
                "Tilapia have many of the same traits that make their family, the cichlids, widespread in the aquarium trade. " +
                        "Though several genera of fish sell under the name \"tilapia,\" most have more or less the same aquarium care requirements. " +
                        "These fish feature bright colors and the same interesting behavior seen across the cichlid family.",
                freshWater, "Tilapia have an omnivorous diet, allowing them to subsist on a wide range of aquarium foods. " +
                "They do lean more toward vegetable matter, so you should make it a point to include green foods in their diet. " +
                "This can include nori—a seaweed available at pet shops and specialty grocery stores—and spirulina-based flake or pellet foods. " +
                "Tilapia also relish the occasional animal-based food, like brine shrimp or bloodworms. " +
                "You can procure these live or frozen at Underwater Lifestyles.",
                2, "");

        fishRepo.save(blueSpottedGrouper);
        fishRepo.save(longNoseButterflyFish);
        fishRepo.save(polleneiGrouper);
        fishRepo.save(redParrotFish);
        fishRepo.save(passerAngelFish);
        fishRepo.save(rainbowWrasse);
        fishRepo.save(smallRedScorpionFish);
        fishRepo.save(tompotBlenny);
        fishRepo.save(electricBlueDempsey);
        fishRepo.save(greenReefChromis);

        fishRepo.save(goldFish);
        fishRepo.save(brownTrout);
        fishRepo.save(americanEel);
        fishRepo.save(bleedingHeartTetra);
        fishRepo.save(rayFinnedFish);
        fishRepo.save(gouramiFish);
        fishRepo.save(nileTalapia);

        Environments huahineItiIslands = new Environments("Huahine-Iti Islands",
                "The Huahine-Iti islands are in the South Pacific Ocean. " +
                        "They are located among the Society Islands apart of French Polynesia. " +
                        "While famous for the for the large freshwater eels, deemed sacred by the locals, " +
                        "at Underwater Lifestyles we are offering saltwater fish from the area.",
                saltWater, 2, "static/images/Huahine-itiIslands.jpg", blueSpottedGrouper, longNoseButterflyFish);
        Environments keyWest = new Environments("Key-West",
                "West is the westmost point in the archipelagos of the Straits of Florida. The saltwater life is a unique fusion of two ecosystems:" +
                        " The Atlantic Ocean, and The Gulf of Mexico. We at Underwater Lifestyles are interested in " +
                        "bringing you some of this diverse life so you can experience it in your home or office.",
                saltWater, 1, "static/images/KeyWest.jpg", passerAngelFish, redParrotFish, polleneiGrouper);
        Environments mediterraneanSea = new Environments("Mediterranean Sea",
                "The Mediterranean Sea is a large body of water connected to the Atlantic Ocean, surrounded entirely by land. " +
                        "Approximately 17,000 species (or over 6% of all know species) have been discovered here. " +
                        "This hot spot for biodiversity is perfect for our mission at Underwater Lifestyles.",
                saltWater, 2, "static/images/Mediterranean Sea.jpg", smallRedScorpionFish, tompotBlenny, rainbowWrasse);
        Environments goldenCoast = new Environments("Golden Coast",
                " Also referred to as the California Coastline, the Golden Coast consists of many microclimates" +
                        " due to the cold California current and the hills and valleys that run up and down it." +
                        " Its vast ecosystem gives much to offer to the environment and from Underwater Lifestyles.",
                saltWater, 1,"static/images/GoldenCoast.jpg", greenReefChromis, electricBlueDempsey);

        Environments lakeErie = new Environments("Lake Erie",
                "Lake Erie is one of the five Great Lakes of the Midwest. It is known for its shallow, warm waters." +
                        " It is fed by Detroit River and drains into the Niagara river, forming the Niagara Falls." +
                        " These elements create a complex ecosystem with many species in constant interaction." +
                        " Underwater Lifestyles calls Lake Erie our home and are dedicated to preserving it.",
                freshWater,0, "static/images/LakeErie.jpg", brownTrout, goldFish);
        Environments roseRiver = new Environments("Rose River",
                "The Rose River is small river in Piedmont Virginia voted best of the Blue Ridge." +
                        " This River is of the many endpoints of the Rappahannock River. " +
                        "Apart of the Healing Waters Project and working closely with Underwater Lifestyles," +
                        " we are helping the environment in this area by bringing you a replication of this remote location.",
                freshWater, 1, "static/images/RoseRiver.jpg", americanEel, bleedingHeartTetra);
        Environments lakeEdward = new Environments("Lake Edward",
                "Lake Edward, or known locally as the Rutanzige, is the Smallest of the African Great Lakes." +
                        " This lake is located within National Parks, both in the Congo, and Uganda." +
                        " Volcanic Fields, with extensive cones and craters give the aquatic life a uniqueness rarely seen anywhere else." +
                        " A stunning environment that is breathtaking to see and be apart of." +
                        " Underwater Lifestyles is helping maintain this lake’s national protection.",
                freshWater, 2, "static/images/Lake Edward.jpg",gouramiFish, nileTalapia, rayFinnedFish );

        environmentRepo.save(huahineItiIslands);
        environmentRepo.save(keyWest);
        environmentRepo.save(mediterraneanSea);
        environmentRepo.save(goldenCoast);

        environmentRepo.save(lakeErie);
        environmentRepo.save(roseRiver);
        environmentRepo.save(lakeEdward);




    }
}