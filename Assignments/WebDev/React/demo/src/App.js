import React, { Component } from 'react';
import Counters from "./components/counters"
import NavBar from "./components/navbar"

class App extends Component {
  state = {
    counters: [
      { id: 1, value: 3 },
      { id: 2, value: 2 },
      { id: 3, value: 1 },
      { id: 4, value: 0 },
    ]
  }
  render() {
    return (
      <React.Fragment>
      <NavBar length={this.state.counters.length}/>
      <main className="container">
            <Counters
            counters={this.state.counters}
            onDelete={this.handleDelete}
            onIncrement={this.handleIncrement}
            onDecrement={this.handleDecrement}
            onReset={this.handleReset}
            />  
      </main>
      </React.Fragment>
    );
  }

  handleDelete = counterId => {
    const counters = this.state.counters.filter(c => c.id !== counterId);
    this.setState({ counters });
  }

  handleIncrement = counter => {
    const counters = [...this.state.counters];
    const index = counters.indexOf(counter);
    counters[index] = counter;
    counters[index].value++;
    this.setState({ counters });
  }

  handleDecrement = counter => {
    const counters = [...this.state.counters];
    const index = counters.indexOf(counter);
    counters[index] = counter;
    if (counters[index].value > 0)
      counters[index].value--;
    this.setState({ counters });
  }

  handleReset = () => {
    const counters = this.state.counters.map(
      c => {
        c.value = 0;
        return c;
      });
    this.setState({ counters });
  }
}

export default App;