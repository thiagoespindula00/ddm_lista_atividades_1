/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, { useState } from 'react';
import type {Node} from 'react';
import {
  Alert,
  Button,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  TextInput,
  useColorScheme,
  View,
} from 'react-native';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

const App: () => Node = () => {

  const [valor1, setValor1]               = useState('');
  const [valor2, setValor2]               = useState('');
  const [valorSorteado, setValorSorteado] = useState('');

  function sortear() {

    if (valor1 == '' || valor1 == '0') {
      Alert.alert('Atenção', 'Informe o valor mínimo!');
      return;
    }

    if (valor2 == '' || valor2 == '0') {
      Alert.alert('Atenção', 'Informe o valor máximo!');
      return;
    }

    if (valor1 > valor2) {
      Alert.alert('Atenção', 'Valor mínimo não pode ser maior que o valor máximo!');
      return;
    }

      setValorSorteado(Math.round(Math.random() * (valor2 - valor1) + valor1));

  }

  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  return (
      <ScrollView
        contentInsetAdjustmentBehavior="automatic"
        style={backgroundStyle}>
        <View
          style={{
            backgroundColor: isDarkMode ? Colors.black : Colors.white,
          }}>
          <View style={{margin: 10}}>
            <TextInput placeholder="Mínimo" keyboardType="numeric" onChangeText={setValor1}/>
            <TextInput placeholder="Máximo" keyboardType="numeric" onChangeText={setValor2}/>
            <Button title="Sortear" onPress={sortear}/>
          </View>
          <View style={{margin: 10}}>
            <Text>
              {valorSorteado}
            </Text>
          </View>
        </View>
      </ScrollView>
  );
};

export default App;
