package telecommande.emb.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import telecommande.commun.dto.DtoCompte;
import telecommande.commun.dto.DtoMarque;
import telecommande.commun.dto.DtoTeleviseur;
import telecommande.emb.data.Compte;
import telecommande.emb.data.Marque;
import telecommande.emb.data.Televiseur;
  
 
@Mapper
public interface IMapper {  
	
	static final IMapper INSTANCE = Mappers.getMapper( IMapper.class );
	
	
	// Comptes
	
	Compte map( DtoCompte source );
	
	DtoCompte map( Compte source );
	
	// Marques
	
	Marque map( DtoMarque source );
		
	DtoMarque map( Marque source );
	
   // Televiseurs
	
	Televiseur map( DtoTeleviseur source );
			
	DtoTeleviseur map( Televiseur source );
}
