
import java.util.*;
/*Les lambdas expressions sont des instances d'interfaces fonctionnelles
 * On sait içi qu'on n'aura qu'une seule commande interne et externe
 * On peut donc utiliser ces interfaces particulières
 * elles se limitent à une méthode abstraite
 */
@FunctionalInterface
interface CommandeExt {
	
		void commandeExterne(int commandeExterne) ;
		
}

