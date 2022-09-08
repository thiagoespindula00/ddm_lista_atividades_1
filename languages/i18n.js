//import { Platform, NativeModules } from 'react-native';
import i18n from 'i18next';
import { initReactI18next } from 'react-i18next';
import pt from './pt.json';
import en from './en.json';

// Função responsável por adquirir o idioma utilizado no device
/*
const getLanguageByDevice = () => {
    return Platform.OS === 'ios'
      ? NativeModules.SettingsManager.settings.AppleLocale // Adquire o idioma no device iOS
      : NativeModules.I18nManager.localeIdentifier // Adquire o idioma no device Android
}
*/

i18n.use(initReactI18next).init({
    compatibilityJSON: 'v3',
    lng: 'en',
    resources: {
        en: en,
        pt: pt
    },
    react:{
        useSuspense: false,
    },
    interpolation:{
        escapeValue: false,
    }
});

export default i18n;
