
import React from 'react';
import ReactDOM from 'react-dom';
import App from './app/App';

if (document.getElementById('app')) {
    ReactDOM.render(<App/>, document.getElementById('app'));
}
