import React from 'react';
import User from './User';
import Message from './Message';

function Card() {
  return (
    <div className='card'>
      <User name='John Smith'/>
      <div className='card-main'>
        <Message text='React is so cool!'/>
      </div>
    </div>
  );
}
export default Card;