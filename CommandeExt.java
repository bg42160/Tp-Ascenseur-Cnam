
import java.util.*;
/*Les lambdas expressions sont des instances d'interfaces fonctionnelles
 * On sait i�i qu'on n'aura qu'une seule commande interne et externe
 * On peut donc utiliser ces interfaces particuli�res
 * elles se limitent � une m�thode abstraite
 */
@FunctionalInterface
interface CommandeExt {
	
		void commandeExterne(int commandeExterne) ;
		
}

