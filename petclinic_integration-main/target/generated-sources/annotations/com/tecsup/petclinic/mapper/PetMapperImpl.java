package com.tecsup.petclinic.mapper;

import com.tecsup.petclinic.domain.PetTO;
import com.tecsup.petclinic.entities.Pet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-05T17:00:58-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class PetMapperImpl implements PetMapper {

    @Override
    public Pet toPet(PetTO petTO) {

        Pet pet = new Pet();

        if ( petTO != null ) {
            pet.setBirthDate( stringToDate( petTO.getBirthDate() ) );
            pet.setId( petTO.getId() );
            pet.setName( petTO.getName() );
            pet.setTypeId( petTO.getTypeId() );
            pet.setOwnerId( petTO.getOwnerId() );
        }

        return pet;
    }

    @Override
    public PetTO toPetTO(Pet pet) {

        PetTO petTO = new PetTO();

        if ( pet != null ) {
            petTO.setBirthDate( dateToString( pet.getBirthDate() ) );
            petTO.setId( pet.getId() );
            petTO.setName( pet.getName() );
            petTO.setTypeId( pet.getTypeId() );
            petTO.setOwnerId( pet.getOwnerId() );
        }

        return petTO;
    }

    @Override
    public List<PetTO> toPetTOList(List<Pet> petList) {
        if ( petList == null ) {
            return new ArrayList<PetTO>();
        }

        List<PetTO> list = new ArrayList<PetTO>( petList.size() );
        for ( Pet pet : petList ) {
            list.add( toPetTO( pet ) );
        }

        return list;
    }

    @Override
    public List<Pet> toPetList(List<PetTO> petTOList) {
        if ( petTOList == null ) {
            return new ArrayList<Pet>();
        }

        List<Pet> list = new ArrayList<Pet>( petTOList.size() );
        for ( PetTO petTO : petTOList ) {
            list.add( toPet( petTO ) );
        }

        return list;
    }
}
