const section = document.querySelector('#container');
const baseUrl = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/';

for (let i = 1; i < 899; i++) {
    const pokemon = document.createElement('div');
    pokemon.classList.add('pokemon');
    const num = document.createElement('span');
    const x = document.createElement('img');
    x.src = `${baseUrl}${i}.png`;
    num.innerText = `#${i}`;
    pokemon.appendChild(x);
    pokemon.appendChild(num);
    section.appendChild(pokemon);
}