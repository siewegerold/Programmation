package telecommande.javafx.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import telecommande.commun.dto.DtoCompte;
import telecommande.commun.dto.DtoMarque;
import telecommande.commun.dto.DtoTeleviseur;
import telecommande.javafx.data.Compte;
import telecommande.javafx.data.Marque;
import telecommande.javafx.data.Televiseur;
   

@Mapper( uses=IMapper.FactoryObsservableList.class  )
public interface IMapper { 
	
	IMapper INSTANCE = Mappers.getMapper( IMapper.class );
	
	
	// Compte
	
	Compte map( DtoCompte source );
	
	DtoCompte map( Compte source );
	
	Compte update( Compte source, @MappingTarget Compte target );
	
	// Marque
	
		Marque map( DtoMarque source );
		
		DtoMarque map( Marque source );
		
		Marque update( Marque source, @MappingTarget Marque target );
		
	// Televiseur
		
		Televiseur map( DtoTeleviseur source );
				
		DtoTeleviseur map( Televiseur source );
				
		Televiseur update( Televiseur source, @MappingTarget Televiseur target );
		
	
    // Classe auxiliaire
    
    public static class FactoryObsservableList {

    	ObservableList<String> createObsListString() {
    		return FXCollections.observableArrayList();
    	}

    }
    
}