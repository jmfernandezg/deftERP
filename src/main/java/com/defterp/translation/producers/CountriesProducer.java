package com.defterp.translation.producers;

import com.defterp.translation.annotations.UserLocale;
import com.defterp.translation.annotations.Countries;
import static com.defterp.translation.annotations.Countries.Version.FIRST;
import static com.defterp.translation.annotations.Countries.Version.SECOND;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 * 
 * @author MOHAMMED BOUNAGA
 * 
 * github.com/medbounaga
 */


public class CountriesProducer {

    @Inject
    @UserLocale
    Locale locale;

    private final static String countries_EN = "{\n"
            + "    \"AF\": \"Afghanistan\",\n"
            + "    \"AL\": \"Albania\",\n"
            + "    \"DZ\": \"Algeria\",\n"
            + "    \"AS\": \"American Samoa\",\n"
            + "    \"AD\": \"Andorra\",\n"
            + "    \"AO\": \"Angola\",\n"
            + "    \"AI\": \"Anguilla\",\n"
            + "    \"AQ\": \"Antarctica\",\n"
            + "    \"AG\": \"Antigua and Barbuda\",\n"
            + "    \"AR\": \"Argentina\",\n"
            + "    \"AM\": \"Armenia\",\n"
            + "    \"AW\": \"Aruba\",\n"
            + "    \"AU\": \"Australia\",\n"
            + "    \"AT\": \"Austria\",\n"
            + "    \"AZ\": \"Azerbaijan\",\n"
            + "    \"BS\": \"Bahamas\",\n"
            + "    \"BH\": \"Bahrain\",\n"
            + "    \"BD\": \"Bangladesh\",\n"
            + "    \"BB\": \"Barbados\",\n"
            + "    \"BY\": \"Belarus\",\n"
            + "    \"BE\": \"Belgium\",\n"
            + "    \"BZ\": \"Belize\",\n"
            + "    \"BJ\": \"Benin\",\n"
            + "    \"BM\": \"Bermuda\",\n"
            + "    \"BT\": \"Bhutan\",\n"
            + "    \"BO\": \"Bolivia\",\n"
            + "    \"BA\": \"Bosnia and Herzegovina\",\n"
            + "    \"BW\": \"Botswana\",\n"
            + "    \"BV\": \"Bouvet Island\",\n"
            + "    \"BR\": \"Brazil\",\n"
            + "    \"BQ\": \"British Antarctic Territory\",\n"
            + "    \"IO\": \"British Indian Ocean Territory\",\n"
            + "    \"VG\": \"British Virgin Islands\",\n"
            + "    \"BN\": \"Brunei\",\n"
            + "    \"BG\": \"Bulgaria\",\n"
            + "    \"BF\": \"Burkina Faso\",\n"
            + "    \"BI\": \"Burundi\",\n"
            + "    \"KH\": \"Cambodia\",\n"
            + "    \"CM\": \"Cameroon\",\n"
            + "    \"CA\": \"Canada\",\n"
            + "    \"CT\": \"Canton and Enderbury Islands\",\n"
            + "    \"CV\": \"Cape Verde\",\n"
            + "    \"KY\": \"Cayman Islands\",\n"
            + "    \"CF\": \"Central African Republic\",\n"
            + "    \"TD\": \"Chad\",\n"
            + "    \"CL\": \"Chile\",\n"
            + "    \"CN\": \"China\",\n"
            + "    \"CX\": \"Christmas Island\",\n"
            + "    \"CC\": \"Cocos [Keeling] Islands\",\n"
            + "    \"CO\": \"Colombia\",\n"
            + "    \"KM\": \"Comoros\",\n"
            + "    \"CG\": \"Congo - Brazzaville\",\n"
            + "    \"CD\": \"Congo - Kinshasa\",\n"
            + "    \"CK\": \"Cook Islands\",\n"
            + "    \"CR\": \"Costa Rica\",\n"
            + "    \"HR\": \"Croatia\",\n"
            + "    \"CU\": \"Cuba\",\n"
            + "    \"CY\": \"Cyprus\",\n"
            + "    \"CZ\": \"Czech Republic\",\n"
            + "    \"CI\": \"C\\u00f4te d\\u2019Ivoire\",\n"
            + "    \"DK\": \"Denmark\",\n"
            + "    \"DJ\": \"Djibouti\",\n"
            + "    \"DM\": \"Dominica\",\n"
            + "    \"DO\": \"Dominican Republic\",\n"
            + "    \"NQ\": \"Dronning Maud Land\",\n"
            + "    \"DD\": \"East Germany\",\n"
            + "    \"EC\": \"Ecuador\",\n"
            + "    \"EG\": \"Egypt\",\n"
            + "    \"SV\": \"El Salvador\",\n"
            + "    \"GQ\": \"Equatorial Guinea\",\n"
            + "    \"ER\": \"Eritrea\",\n"
            + "    \"EE\": \"Estonia\",\n"
            + "    \"ET\": \"Ethiopia\",\n"
            + "    \"FK\": \"Falkland Islands\",\n"
            + "    \"FO\": \"Faroe Islands\",\n"
            + "    \"FJ\": \"Fiji\",\n"
            + "    \"FI\": \"Finland\",\n"
            + "    \"FR\": \"France\",\n"
            + "    \"GF\": \"French Guiana\",\n"
            + "    \"PF\": \"French Polynesia\",\n"
            + "    \"TF\": \"French Southern Territories\",\n"
            + "    \"FQ\": \"French Southern and Antarctic Territories\",\n"
            + "    \"GA\": \"Gabon\",\n"
            + "    \"GM\": \"Gambia\",\n"
            + "    \"GE\": \"Georgia\",\n"
            + "    \"DE\": \"Germany\",\n"
            + "    \"GH\": \"Ghana\",\n"
            + "    \"GI\": \"Gibraltar\",\n"
            + "    \"GR\": \"Greece\",\n"
            + "    \"GL\": \"Greenland\",\n"
            + "    \"GD\": \"Grenada\",\n"
            + "    \"GP\": \"Guadeloupe\",\n"
            + "    \"GU\": \"Guam\",\n"
            + "    \"GT\": \"Guatemala\",\n"
            + "    \"GG\": \"Guernsey\",\n"
            + "    \"GN\": \"Guinea\",\n"
            + "    \"GW\": \"Guinea-Bissau\",\n"
            + "    \"GY\": \"Guyana\",\n"
            + "    \"HT\": \"Haiti\",\n"
            + "    \"HM\": \"Heard Island and McDonald Islands\",\n"
            + "    \"HN\": \"Honduras\",\n"
            + "    \"HK\": \"Hong Kong SAR China\",\n"
            + "    \"HU\": \"Hungary\",\n"
            + "    \"IS\": \"Iceland\",\n"
            + "    \"IN\": \"India\",\n"
            + "    \"ID\": \"Indonesia\",\n"
            + "    \"IR\": \"Iran\",\n"
            + "    \"IQ\": \"Iraq\",\n"
            + "    \"IE\": \"Ireland\",\n"
            + "    \"IM\": \"Isle of Man\",\n"
            + "    \"IL\": \"Israel\",\n"
            + "    \"IT\": \"Italy\",\n"
            + "    \"JM\": \"Jamaica\",\n"
            + "    \"JP\": \"Japan\",\n"
            + "    \"JE\": \"Jersey\",\n"
            + "    \"JT\": \"Johnston Island\",\n"
            + "    \"JO\": \"Jordan\",\n"
            + "    \"KZ\": \"Kazakhstan\",\n"
            + "    \"KE\": \"Kenya\",\n"
            + "    \"KI\": \"Kiribati\",\n"
            + "    \"KW\": \"Kuwait\",\n"
            + "    \"KG\": \"Kyrgyzstan\",\n"
            + "    \"LA\": \"Laos\",\n"
            + "    \"LV\": \"Latvia\",\n"
            + "    \"LB\": \"Lebanon\",\n"
            + "    \"LS\": \"Lesotho\",\n"
            + "    \"LR\": \"Liberia\",\n"
            + "    \"LY\": \"Libya\",\n"
            + "    \"LI\": \"Liechtenstein\",\n"
            + "    \"LT\": \"Lithuania\",\n"
            + "    \"LU\": \"Luxembourg\",\n"
            + "    \"MO\": \"Macau SAR China\",\n"
            + "    \"MK\": \"Macedonia\",\n"
            + "    \"MG\": \"Madagascar\",\n"
            + "    \"MW\": \"Malawi\",\n"
            + "    \"MY\": \"Malaysia\",\n"
            + "    \"MV\": \"Maldives\",\n"
            + "    \"ML\": \"Mali\",\n"
            + "    \"MT\": \"Malta\",\n"
            + "    \"MH\": \"Marshall Islands\",\n"
            + "    \"MQ\": \"Martinique\",\n"
            + "    \"MR\": \"Mauritania\",\n"
            + "    \"MU\": \"Mauritius\",\n"
            + "    \"YT\": \"Mayotte\",\n"
            + "    \"FX\": \"Metropolitan France\",\n"
            + "    \"MX\": \"Mexico\",\n"
            + "    \"FM\": \"Micronesia\",\n"
            + "    \"MI\": \"Midway Islands\",\n"
            + "    \"MD\": \"Moldova\",\n"
            + "    \"MC\": \"Monaco\",\n"
            + "    \"MN\": \"Mongolia\",\n"
            + "    \"ME\": \"Montenegro\",\n"
            + "    \"MS\": \"Montserrat\",\n"
            + "    \"MA\": \"Morocco\",\n"
            + "    \"MZ\": \"Mozambique\",\n"
            + "    \"MM\": \"Myanmar [Burma]\",\n"
            + "    \"NA\": \"Namibia\",\n"
            + "    \"NR\": \"Nauru\",\n"
            + "    \"NP\": \"Nepal\",\n"
            + "    \"NL\": \"Netherlands\",\n"
            + "    \"AN\": \"Netherlands Antilles\",\n"
            + "    \"NT\": \"Neutral Zone\",\n"
            + "    \"NC\": \"New Caledonia\",\n"
            + "    \"NZ\": \"New Zealand\",\n"
            + "    \"NI\": \"Nicaragua\",\n"
            + "    \"NE\": \"Niger\",\n"
            + "    \"NG\": \"Nigeria\",\n"
            + "    \"NU\": \"Niue\",\n"
            + "    \"NF\": \"Norfolk Island\",\n"
            + "    \"KP\": \"North Korea\",\n"
            + "    \"VD\": \"North Vietnam\",\n"
            + "    \"MP\": \"Northern Mariana Islands\",\n"
            + "    \"NO\": \"Norway\",\n"
            + "    \"OM\": \"Oman\",\n"
            + "    \"PC\": \"Pacific Islands Trust Territory\",\n"
            + "    \"PK\": \"Pakistan\",\n"
            + "    \"PW\": \"Palau\",\n"
            + "    \"PS\": \"Palestinian Territories\",\n"
            + "    \"PA\": \"Panama\",\n"
            + "    \"PZ\": \"Panama Canal Zone\",\n"
            + "    \"PG\": \"Papua New Guinea\",\n"
            + "    \"PY\": \"Paraguay\",\n"
            + "    \"YD\": \"People's Democratic Republic of Yemen\",\n"
            + "    \"PE\": \"Peru\",\n"
            + "    \"PH\": \"Philippines\",\n"
            + "    \"PN\": \"Pitcairn Islands\",\n"
            + "    \"PL\": \"Poland\",\n"
            + "    \"PT\": \"Portugal\",\n"
            + "    \"PR\": \"Puerto Rico\",\n"
            + "    \"QA\": \"Qatar\",\n"
            + "    \"RO\": \"Romania\",\n"
            + "    \"RU\": \"Russia\",\n"
            + "    \"RW\": \"Rwanda\",\n"
            + "    \"RE\": \"R\\u00e9union\",\n"
            + "    \"BL\": \"Saint Barth\\u00e9lemy\",\n"
            + "    \"SH\": \"Saint Helena\",\n"
            + "    \"KN\": \"Saint Kitts and Nevis\",\n"
            + "    \"LC\": \"Saint Lucia\",\n"
            + "    \"MF\": \"Saint Martin\",\n"
            + "    \"PM\": \"Saint Pierre and Miquelon\",\n"
            + "    \"VC\": \"Saint Vincent and the Grenadines\",\n"
            + "    \"WS\": \"Samoa\",\n"
            + "    \"SM\": \"San Marino\",\n"
            + "    \"SA\": \"Saudi Arabia\",\n"
            + "    \"SN\": \"Senegal\",\n"
            + "    \"RS\": \"Serbia\",\n"
            + "    \"CS\": \"Serbia and Montenegro\",\n"
            + "    \"SC\": \"Seychelles\",\n"
            + "    \"SL\": \"Sierra Leone\",\n"
            + "    \"SG\": \"Singapore\",\n"
            + "    \"SK\": \"Slovakia\",\n"
            + "    \"SI\": \"Slovenia\",\n"
            + "    \"SB\": \"Solomon Islands\",\n"
            + "    \"SO\": \"Somalia\",\n"
            + "    \"ZA\": \"South Africa\",\n"
            + "    \"GS\": \"South Georgia and the South Sandwich Islands\",\n"
            + "    \"KR\": \"South Korea\",\n"
            + "    \"ES\": \"Spain\",\n"
            + "    \"LK\": \"Sri Lanka\",\n"
            + "    \"SD\": \"Sudan\",\n"
            + "    \"SR\": \"Suriname\",\n"
            + "    \"SJ\": \"Svalbard and Jan Mayen\",\n"
            + "    \"SZ\": \"Swaziland\",\n"
            + "    \"SE\": \"Sweden\",\n"
            + "    \"CH\": \"Switzerland\",\n"
            + "    \"SY\": \"Syria\",\n"
            + "    \"ST\": \"S\\u00e3o Tom\\u00e9 and Pr\\u00edncipe\",\n"
            + "    \"TW\": \"Taiwan\",\n"
            + "    \"TJ\": \"Tajikistan\",\n"
            + "    \"TZ\": \"Tanzania\",\n"
            + "    \"TH\": \"Thailand\",\n"
            + "    \"TL\": \"Timor-Leste\",\n"
            + "    \"TG\": \"Togo\",\n"
            + "    \"TK\": \"Tokelau\",\n"
            + "    \"TO\": \"Tonga\",\n"
            + "    \"TT\": \"Trinidad and Tobago\",\n"
            + "    \"TN\": \"Tunisia\",\n"
            + "    \"TR\": \"Turkey\",\n"
            + "    \"TM\": \"Turkmenistan\",\n"
            + "    \"TC\": \"Turks and Caicos Islands\",\n"
            + "    \"TV\": \"Tuvalu\",\n"
            + "    \"UM\": \"U.S. Minor Outlying Islands\",\n"
            + "    \"PU\": \"U.S. Miscellaneous Pacific Islands\",\n"
            + "    \"VI\": \"U.S. Virgin Islands\",\n"
            + "    \"UG\": \"Uganda\",\n"
            + "    \"UA\": \"Ukraine\",\n"
            + "    \"SU\": \"Union of Soviet Socialist Republics\",\n"
            + "    \"AE\": \"United Arab Emirates\",\n"
            + "    \"GB\": \"United Kingdom\",\n"
            + "    \"US\": \"United States\",\n"
            + "    \"ZZ\": \"Unknown or Invalid Region\",\n"
            + "    \"UY\": \"Uruguay\",\n"
            + "    \"UZ\": \"Uzbekistan\",\n"
            + "    \"VU\": \"Vanuatu\",\n"
            + "    \"VA\": \"Vatican City\",\n"
            + "    \"VE\": \"Venezuela\",\n"
            + "    \"VN\": \"Vietnam\",\n"
            + "    \"WK\": \"Wake Island\",\n"
            + "    \"WF\": \"Wallis and Futuna\",\n"
            + "    \"EH\": \"Western Sahara\",\n"
            + "    \"YE\": \"Yemen\",\n"
            + "    \"ZM\": \"Zambia\",\n"
            + "    \"ZW\": \"Zimbabwe\",\n"
            + "    \"AX\": \"\\u00c5land Islands\"\n"
            + "}";

    private static final String countries_FR = "{\n"
            + "    \"AF\": \"Afghanistan\",\n"
            + "    \"ZA\": \"Afrique du Sud\",\n"
            + "    \"AL\": \"Albanie\",\n"
            + "    \"DZ\": \"Alg\\u00e9rie\",\n"
            + "    \"DE\": \"Allemagne\",\n"
            + "    \"AD\": \"Andorre\",\n"
            + "    \"AO\": \"Angola\",\n"
            + "    \"AI\": \"Anguilla\",\n"
            + "    \"AQ\": \"Antarctique\",\n"
            + "    \"AG\": \"Antigua-et-Barbuda\",\n"
            + "    \"AN\": \"Antilles n\\u00e9erlandaises\",\n"
            + "    \"SA\": \"Arabie saoudite\",\n"
            + "    \"AR\": \"Argentine\",\n"
            + "    \"AM\": \"Arm\\u00e9nie\",\n"
            + "    \"AW\": \"Aruba\",\n"
            + "    \"AU\": \"Australie\",\n"
            + "    \"AT\": \"Autriche\",\n"
            + "    \"AZ\": \"Azerba\\u00efdjan\",\n"
            + "    \"BS\": \"Bahamas\",\n"
            + "    \"BH\": \"Bahre\\u00efn\",\n"
            + "    \"BD\": \"Bangladesh\",\n"
            + "    \"BB\": \"Barbade\",\n"
            + "    \"BE\": \"Belgique\",\n"
            + "    \"BZ\": \"Belize\",\n"
            + "    \"BM\": \"Bermudes\",\n"
            + "    \"BT\": \"Bhoutan\",\n"
            + "    \"BO\": \"Bolivie\",\n"
            + "    \"BA\": \"Bosnie-Herz\\u00e9govine\",\n"
            + "    \"BW\": \"Botswana\",\n"
            + "    \"BN\": \"Brun\\u00e9i Darussalam\",\n"
            + "    \"BR\": \"Br\\u00e9sil\",\n"
            + "    \"BG\": \"Bulgarie\",\n"
            + "    \"BF\": \"Burkina Faso\",\n"
            + "    \"BI\": \"Burundi\",\n"
            + "    \"BY\": \"B\\u00e9larus\",\n"
            + "    \"BJ\": \"B\\u00e9nin\",\n"
            + "    \"KH\": \"Cambodge\",\n"
            + "    \"CM\": \"Cameroun\",\n"
            + "    \"CA\": \"Canada\",\n"
            + "    \"CV\": \"Cap-Vert\",\n"
            + "    \"CL\": \"Chili\",\n"
            + "    \"CN\": \"Chine\",\n"
            + "    \"CY\": \"Chypre\",\n"
            + "    \"CO\": \"Colombie\",\n"
            + "    \"KM\": \"Comores\",\n"
            + "    \"CG\": \"Congo\",\n"
            + "    \"KP\": \"Cor\\u00e9e du Nord\",\n"
            + "    \"KR\": \"Cor\\u00e9e du Sud\",\n"
            + "    \"CR\": \"Costa Rica\",\n"
            + "    \"HR\": \"Croatie\",\n"
            + "    \"CU\": \"Cuba\",\n"
            + "    \"CI\": \"C\\u00f4te d\\u2019Ivoire\",\n"
            + "    \"DK\": \"Danemark\",\n"
            + "    \"DJ\": \"Djibouti\",\n"
            + "    \"DM\": \"Dominique\",\n"
            + "    \"SV\": \"El Salvador\",\n"
            + "    \"ES\": \"Espagne\",\n"
            + "    \"EE\": \"Estonie\",\n"
            + "    \"FJ\": \"Fidji\",\n"
            + "    \"FI\": \"Finlande\",\n"
            + "    \"FR\": \"France\",\n"
            + "    \"GA\": \"Gabon\",\n"
            + "    \"GM\": \"Gambie\",\n"
            + "    \"GH\": \"Ghana\",\n"
            + "    \"GI\": \"Gibraltar\",\n"
            + "    \"GD\": \"Grenade\",\n"
            + "    \"GL\": \"Groenland\",\n"
            + "    \"GR\": \"Gr\\u00e8ce\",\n"
            + "    \"GP\": \"Guadeloupe\",\n"
            + "    \"GU\": \"Guam\",\n"
            + "    \"GT\": \"Guatemala\",\n"
            + "    \"GG\": \"Guernesey\",\n"
            + "    \"GN\": \"Guin\\u00e9e\",\n"
            + "    \"GQ\": \"Guin\\u00e9e \\u00e9quatoriale\",\n"
            + "    \"GW\": \"Guin\\u00e9e-Bissau\",\n"
            + "    \"GY\": \"Guyana\",\n"
            + "    \"GF\": \"Guyane fran\\u00e7aise\",\n"
            + "    \"GE\": \"G\\u00e9orgie\",\n"
            + "    \"GS\": \"G\\u00e9orgie du Sud et les \\u00eeles Sandwich du Sud\",\n"
            + "    \"HT\": \"Ha\\u00efti\",\n"
            + "    \"HN\": \"Honduras\",\n"
            + "    \"HU\": \"Hongrie\",\n"
            + "    \"IN\": \"Inde\",\n"
            + "    \"ID\": \"Indon\\u00e9sie\",\n"
            + "    \"IQ\": \"Irak\",\n"
            + "    \"IR\": \"Iran\",\n"
            + "    \"IE\": \"Irlande\",\n"
            + "    \"IS\": \"Islande\",\n"
            + "    \"IL\": \"Isra\\u00ebl\",\n"
            + "    \"IT\": \"Italie\",\n"
            + "    \"JM\": \"Jama\\u00efque\",\n"
            + "    \"JP\": \"Japon\",\n"
            + "    \"JE\": \"Jersey\",\n"
            + "    \"JO\": \"Jordanie\",\n"
            + "    \"KZ\": \"Kazakhstan\",\n"
            + "    \"KE\": \"Kenya\",\n"
            + "    \"KG\": \"Kirghizistan\",\n"
            + "    \"KI\": \"Kiribati\",\n"
            + "    \"KW\": \"Kowe\\u00eft\",\n"
            + "    \"LA\": \"Laos\",\n"
            + "    \"LS\": \"Lesotho\",\n"
            + "    \"LV\": \"Lettonie\",\n"
            + "    \"LB\": \"Liban\",\n"
            + "    \"LY\": \"Libye\",\n"
            + "    \"LR\": \"Lib\\u00e9ria\",\n"
            + "    \"LI\": \"Liechtenstein\",\n"
            + "    \"LT\": \"Lituanie\",\n"
            + "    \"LU\": \"Luxembourg\",\n"
            + "    \"MK\": \"Mac\\u00e9doine\",\n"
            + "    \"MG\": \"Madagascar\",\n"
            + "    \"MY\": \"Malaisie\",\n"
            + "    \"MW\": \"Malawi\",\n"
            + "    \"MV\": \"Maldives\",\n"
            + "    \"ML\": \"Mali\",\n"
            + "    \"MT\": \"Malte\",\n"
            + "    \"MA\": \"Maroc\",\n"
            + "    \"MQ\": \"Martinique\",\n"
            + "    \"MU\": \"Maurice\",\n"
            + "    \"MR\": \"Mauritanie\",\n"
            + "    \"YT\": \"Mayotte\",\n"
            + "    \"MX\": \"Mexique\",\n"
            + "    \"MD\": \"Moldavie\",\n"
            + "    \"MC\": \"Monaco\",\n"
            + "    \"MN\": \"Mongolie\",\n"
            + "    \"MS\": \"Montserrat\",\n"
            + "    \"ME\": \"Mont\\u00e9n\\u00e9gro\",\n"
            + "    \"MZ\": \"Mozambique\",\n"
            + "    \"MM\": \"Myanmar\",\n"
            + "    \"NA\": \"Namibie\",\n"
            + "    \"NR\": \"Nauru\",\n"
            + "    \"NI\": \"Nicaragua\",\n"
            + "    \"NE\": \"Niger\",\n"
            + "    \"NG\": \"Nig\\u00e9ria\",\n"
            + "    \"NU\": \"Niue\",\n"
            + "    \"NO\": \"Norv\\u00e8ge\",\n"
            + "    \"NC\": \"Nouvelle-Cal\\u00e9donie\",\n"
            + "    \"NZ\": \"Nouvelle-Z\\u00e9lande\",\n"
            + "    \"NP\": \"N\\u00e9pal\",\n"
            + "    \"OM\": \"Oman\",\n"
            + "    \"UG\": \"Ouganda\",\n"
            + "    \"UZ\": \"Ouzb\\u00e9kistan\",\n"
            + "    \"PK\": \"Pakistan\",\n"
            + "    \"PW\": \"Palaos\",\n"
            + "    \"PA\": \"Panama\",\n"
            + "    \"PG\": \"Papouasie-Nouvelle-Guin\\u00e9e\",\n"
            + "    \"PY\": \"Paraguay\",\n"
            + "    \"NL\": \"Pays-Bas\",\n"
            + "    \"PH\": \"Philippines\",\n"
            + "    \"PN\": \"Pitcairn\",\n"
            + "    \"PL\": \"Pologne\",\n"
            + "    \"PF\": \"Polyn\\u00e9sie fran\\u00e7aise\",\n"
            + "    \"PR\": \"Porto Rico\",\n"
            + "    \"PT\": \"Portugal\",\n"
            + "    \"PE\": \"P\\u00e9rou\",\n"
            + "    \"QA\": \"Qatar\",\n"
            + "    \"HK\": \"R.A.S. chinoise de Hong Kong\",\n"
            + "    \"MO\": \"R.A.S. chinoise de Macao\",\n"
            + "    \"RO\": \"Roumanie\",\n"
            + "    \"GB\": \"Royaume-Uni\",\n"
            + "    \"RU\": \"Russie\",\n"
            + "    \"RW\": \"Rwanda\",\n"
            + "    \"CF\": \"R\\u00e9publique centrafricaine\",\n"
            + "    \"DO\": \"R\\u00e9publique dominicaine\",\n"
            + "    \"CD\": \"R\\u00e9publique d\\u00e9mocratique du Congo\",\n"
            + "    \"CZ\": \"R\\u00e9publique tch\\u00e8que\",\n"
            + "    \"RE\": \"R\\u00e9union\",\n"
            + "    \"EH\": \"Sahara occidental\",\n"
            + "    \"BL\": \"Saint-Barth\\u00e9l\\u00e9my\",\n"
            + "    \"KN\": \"Saint-Kitts-et-Nevis\",\n"
            + "    \"SM\": \"Saint-Marin\",\n"
            + "    \"MF\": \"Saint-Martin\",\n"
            + "    \"PM\": \"Saint-Pierre-et-Miquelon\",\n"
            + "    \"VC\": \"Saint-Vincent-et-les Grenadines\",\n"
            + "    \"SH\": \"Sainte-H\\u00e9l\\u00e8ne\",\n"
            + "    \"LC\": \"Sainte-Lucie\",\n"
            + "    \"WS\": \"Samoa\",\n"
            + "    \"AS\": \"Samoa am\\u00e9ricaines\",\n"
            + "    \"ST\": \"Sao Tom\\u00e9-et-Principe\",\n"
            + "    \"RS\": \"Serbie\",\n"
            + "    \"CS\": \"Serbie-et-Mont\\u00e9n\\u00e9gro\",\n"
            + "    \"SC\": \"Seychelles\",\n"
            + "    \"SL\": \"Sierra Leone\",\n"
            + "    \"SG\": \"Singapour\",\n"
            + "    \"SK\": \"Slovaquie\",\n"
            + "    \"SI\": \"Slov\\u00e9nie\",\n"
            + "    \"SO\": \"Somalie\",\n"
            + "    \"SD\": \"Soudan\",\n"
            + "    \"LK\": \"Sri Lanka\",\n"
            + "    \"CH\": \"Suisse\",\n"
            + "    \"SR\": \"Suriname\",\n"
            + "    \"SE\": \"Su\\u00e8de\",\n"
            + "    \"SJ\": \"Svalbard et \\u00cele Jan Mayen\",\n"
            + "    \"SZ\": \"Swaziland\",\n"
            + "    \"SY\": \"Syrie\",\n"
            + "    \"SN\": \"S\\u00e9n\\u00e9gal\",\n"
            + "    \"TJ\": \"Tadjikistan\",\n"
            + "    \"TZ\": \"Tanzanie\",\n"
            + "    \"TW\": \"Ta\\u00efwan\",\n"
            + "    \"TD\": \"Tchad\",\n"
            + "    \"TF\": \"Terres australes fran\\u00e7aises\",\n"
            + "    \"IO\": \"Territoire britannique de l'oc\\u00e9an Indien\",\n"
            + "    \"PS\": \"Territoire palestinien\",\n"
            + "    \"TH\": \"Tha\\u00eflande\",\n"
            + "    \"TL\": \"Timor oriental\",\n"
            + "    \"TG\": \"Togo\",\n"
            + "    \"TK\": \"Tokelau\",\n"
            + "    \"TO\": \"Tonga\",\n"
            + "    \"TT\": \"Trinit\\u00e9-et-Tobago\",\n"
            + "    \"TN\": \"Tunisie\",\n"
            + "    \"TM\": \"Turkm\\u00e9nistan\",\n"
            + "    \"TR\": \"Turquie\",\n"
            + "    \"TV\": \"Tuvalu\",\n"
            + "    \"UA\": \"Ukraine\",\n"
            + "    \"UY\": \"Uruguay\",\n"
            + "    \"VU\": \"Vanuatu\",\n"
            + "    \"VE\": \"Venezuela\",\n"
            + "    \"VN\": \"Vi\\u00eat Nam\",\n"
            + "    \"WF\": \"Wallis-et-Futuna\",\n"
            + "    \"YE\": \"Y\\u00e9men\",\n"
            + "    \"ZM\": \"Zambie\",\n"
            + "    \"ZW\": \"Zimbabwe\",\n"
            + "    \"ZZ\": \"r\\u00e9gion ind\\u00e9termin\\u00e9e\",\n"
            + "    \"EG\": \"\\u00c9gypte\",\n"
            + "    \"AE\": \"\\u00c9mirats arabes unis\",\n"
            + "    \"EC\": \"\\u00c9quateur\",\n"
            + "    \"ER\": \"\\u00c9rythr\\u00e9e\",\n"
            + "    \"VA\": \"\\u00c9tat de la Cit\\u00e9 du Vatican\",\n"
            + "    \"FM\": \"\\u00c9tats f\\u00e9d\\u00e9r\\u00e9s de Micron\\u00e9sie\",\n"
            + "    \"US\": \"\\u00c9tats-Unis\",\n"
            + "    \"ET\": \"\\u00c9thiopie\",\n"
            + "    \"BV\": \"\\u00cele Bouvet\",\n"
            + "    \"CX\": \"\\u00cele Christmas\",\n"
            + "    \"NF\": \"\\u00cele Norfolk\",\n"
            + "    \"IM\": \"\\u00cele de Man\",\n"
            + "    \"KY\": \"\\u00celes Ca\\u00efmans\",\n"
            + "    \"CC\": \"\\u00celes Cocos - Keeling\",\n"
            + "    \"CK\": \"\\u00celes Cook\",\n"
            + "    \"FO\": \"\\u00celes F\\u00e9ro\\u00e9\",\n"
            + "    \"HM\": \"\\u00celes Heard et MacDonald\",\n"
            + "    \"FK\": \"\\u00celes Malouines\",\n"
            + "    \"MP\": \"\\u00celes Mariannes du Nord\",\n"
            + "    \"MH\": \"\\u00celes Marshall\",\n"
            + "    \"UM\": \"\\u00celes Mineures \\u00c9loign\\u00e9es des \\u00c9tats-Unis\",\n"
            + "    \"SB\": \"\\u00celes Salomon\",\n"
            + "    \"TC\": \"\\u00celes Turks et Ca\\u00efques\",\n"
            + "    \"VG\": \"\\u00celes Vierges britanniques\",\n"
            + "    \"VI\": \"\\u00celes Vierges des \\u00c9tats-Unis\",\n"
            + "    \"AX\": \"\\u00celes \\u00c5land\"\n"
            + "}";

    

    @Produces
    @Countries(version = FIRST)
    public HashMap<String, String> getCountriesFirstVersion() {

        String countries = getCountriesString();
        return populateHashMap(countries, "first");

//        if (language.equals("fr")) {
//            countries = countries_FR;
//        } else {
//            countries = countries_EN;
//        }
    }

    @Produces
    @Countries(version = SECOND)
    public HashMap<String, String> getcountriesSecondVersion() {

        String countries = getCountriesString();
        return populateHashMap(countries, "second");

//        if (language.equals("fr")) {
//            countries = countries_FR;
//        } else {
//            countries = countries_EN;
//        }
    }
    
    
    public String getCountriesString() {

        if (locale.getDisplayLanguage(Locale.ENGLISH).equalsIgnoreCase("french")) {
            return countries_FR;
        } else {
            return countries_EN;
        }
    }

    public HashMap<String, String> populateHashMap(String countries, String type) {

        HashMap<String, String> countriesMap = new HashMap<>();

        try {
            JSONObject jObject = new JSONObject(countries);
            
            Iterator<?> keys = jObject.keys();

            while (keys.hasNext()) {
                String value = (String) keys.next();
                String key = jObject.getString(value);
                if (type.equals("first")) {
                    countriesMap.put(key, value);
                } else if (type.equals("second")) {
                    countriesMap.put(value, key);
                }
            }

            return countriesMap;
        } catch (JSONException ex) {
            countriesMap = null;
        }

        return countriesMap;
    }

}
