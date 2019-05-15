import React from 'react';
import Title from './components/Title';
import Card from './components/Card';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      cards: [
        {
          author: 'John Smith',
          text: 'React is so cool!'
        },
        {
          author: 'Jane Doe',
          text: 'I use React for all my projects!'
        }
      ]
    };
  }
  
  render() {
    const cards = this.state.cards.map((card, index) => (
      <Card author={card.author}
        text={card.text}
        key={index} />
    ));

    return (
      <div>
        <Title />
        { cards }
      </div>
    );
  }
}

export default App;
