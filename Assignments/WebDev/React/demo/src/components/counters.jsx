import React, { Component } from 'react';
import Counter from "./count"


class Counters extends Component {
    render(){
        const {onDelete, onIncrement , onDecrement, onReset }=this.props;
        return (
            <React.Fragment>
            <button className="btn btn-info m-2" onClick={onReset}>Reset</button>
            <br/>
            {this.props.counters.map(counter =>{
                
                return (<Counter key={counter.id} onDelete={onDelete} onIncrement={onIncrement} onDecrement={onDecrement} counter={counter}
                />);
            }
            )}
            </React.Fragment>
        );
    }
    
}
 
export default Counters;