import React from 'react';
import User from './User';
import Message from './Message';
/*
pass with {props.name}
element = <MyComponent name = string />
*/

const Card = (props) => {
  return (
    <div className='card'>
      <User name={props.author}/>
      <div className='card-main'>
        <Message text={props.text}/>
      </div>
    </div>
  );
}
export default Card;
