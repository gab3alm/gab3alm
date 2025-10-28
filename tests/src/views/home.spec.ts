import { mount } from '@vue/test-utils';
import Home from '../../../src/views/Home.vue';

describe('Home Page Component', () => {
    it('should render homepage component', () => {
        const wrapper = mount(Home);
        expect(wrapper.text()).toContain('portfolio');
    });
});