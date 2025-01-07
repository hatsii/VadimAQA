package builders;

import pojo.PostPetStorePet;

import java.util.Arrays;
import java.util.Collections;

public class PetStorePetGenerator {

    public static PostPetStorePet setPetData(){
        return PostPetStorePet
                .builder()
                .name("DogsAQA")
                .id(1)
                .category(PostPetStorePet.Category.builder()
                        .id(101)
                        .name("Dog")
                        .build())
                .tags(Arrays.asList(
                        PostPetStorePet.TagsItem.builder().id(1).name("friendly").build(),
                        PostPetStorePet.TagsItem.builder().id(2).name("playful").build()
                ))
                .photoUrls(Collections.emptyList())
                .status("available")
                .build();
    }

}

